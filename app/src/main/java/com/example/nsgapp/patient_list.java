package com.example.nsgapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.example.nsgapp.R.layout.activity_patient_list;

public class patient_list extends AppCompatActivity {
    private TextView studyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_patient_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        studyListView = findViewById(R.id.patientList);
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        InterfaceAPI api = retrofit.create(InterfaceAPI.class);
        Call<List<Study>> call = api.getStudies();
        call.enqueue(new Callback<List<Study>>() {
            @Override
            public void onResponse(Call<List<Study>> call, Response<List<Study>> response) {
                if (!response.isSuccessful()){
                    studyListView.setText("Code: " + response.code());
                    return;
                }
                List<Study> studies = response.body();
                for (Study study : studies){
                    String content = "";
                    content += "Study Name: " + study.getStudyName() + "\n";
                    content += "Patient Name: " + study.getPatientName() + "\n";
                    content += "Study ID: " + study.getStudyID() + "\n";
                    content += "Study Status: " + study.getStudyStatus() + "\n\n";

                    studyListView.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Study>> call, Throwable t) {
                studyListView.setText(t.getMessage());
            }
        });

        Button logout_button = (Button) findViewById(R.id.logout);
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patient_list.this, login_screen.class);
                startActivity(intent);
            }
        });
    }
/*
    public void back_to_login(View view)
    {
        String button_text;
        button_text =((Button)view).getText().toString();
        if(button_text.equals("Logout"))
        {
            Intent intent = new Intent(this, login_screen.class);
            startActivity(intent);
        }
        else if (button_text.equals("Select Patient"))
        {
            Intent patient_selected = new Intent(this, MainActivity.class);
            startActivity(patient_selected);
        }
    }
    */
}