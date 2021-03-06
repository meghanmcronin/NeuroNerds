package com.example.nsgapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Base64;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.util.Log;
import android.app.Activity;
import android.app.ProgressDialog;

import android.widget.ListView;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.nsgapp.R.layout.activity_patient_list;

public class patient_list extends AppCompatActivity {
    boolean isSelected = false;
    String responseText;
    Activity activity;
    ArrayList<Study> studies = new ArrayList();
    private ProgressDialog progressDialog;
    ListView listView;

    //Base URL of our web service
    public static final String BASE_URL = "http://10.0.2.2:8080/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list);
        activity = this;
        listView = (ListView) findViewById(R.id.patientList);
        studies.clear();

        progressDialog = new ProgressDialog(patient_list.this);
        progressDialog.setMessage("Fetching patient data");
        progressDialog.setCancelable(false);
        progressDialog.show();
        //Call WebService
        getWebServiceResponseData();
    }

    protected Void getWebServiceResponseData() {

        //Creating an object of our api interface
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        InterfaceAPI api = retrofit.create(InterfaceAPI.class);
        Call<List<Study>> call = api.getStudies();

        call.enqueue(new Callback<List<Study>>() {
            @Override
            public void onResponse(Call<List<Study>> call, Response<List<Study>> response) {
                try {
                    studies = (ArrayList<Study>)response.body();

                    if (progressDialog.isShowing())
                        progressDialog.dismiss();
                    // For populating list data

                    //CustomPatientList customPatientList = new CustomPatientList(activity, studies);
                    //ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, );
                    //listView.setAdapter(customPatientList);

                    CustomPatientList customPatientList = new CustomPatientList(activity, studies);
                    listView.setAdapter(customPatientList);
/*
                    listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Toast.makeText(patient_list.this,"You Selected "+ studies.get(position).getStudyName(),Toast.LENGTH_SHORT).show();
                            isSelected = true;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    }); */
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            view.setSelected(true);
                            String content = "";

                            content += "Study Name: " + studies.get(position).getStudyName() + "\n";
                            content += "Patient Name: " + studies.get(position).getPatientName() + "\n";
                            content += "Study ID: " + studies.get(position).getStudyID() + "\n";
                            content += "Study Status: " + studies.get(position).getStudyStatus() + "\n\n";

                            responseText = content;
                            Toast.makeText(patient_list.this,"You Selected "+ studies.get(position).getStudyName(),Toast.LENGTH_SHORT).show();
                            isSelected = true;
                            }
                    });

                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<List<Study>> call, Throwable t) {
                Log.d("Failure",t.toString());
            }
        });

        Button logout_button = (Button) findViewById(R.id.logout);
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        Button confirm = (Button) findViewById(R.id.confirm_button);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(patient_list.this, MainActivity.class);
                startActivity(intent);
                */
                if (isSelected) {
                    Intent intent = new Intent(patient_list.this, MainActivity.class);
                    intent.putExtra("extra", responseText);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Select a study!", Toast.LENGTH_SHORT).show();
            }
        });
        return null;
    }

    private void logout() {
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        InterfaceAPI api = retrofit.create(InterfaceAPI.class);

        Call<Void> new_call = api.auth_logout();

        new_call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> new_call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Intent intent = new Intent(patient_list.this, login_screen.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Successfully Logged Out.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Logout Failed.", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<Void> new_call, Throwable t) {
                Log.e("CHECK_LOGOUT", t.toString());
                t.printStackTrace();
            }
        });
    }
}


/*
public class patient_list extends AppCompatActivity {
    private TextView studyListView;

    private Spinner spinner;

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
                List<String> studyIDs = new ArrayList<>();
                for (Study study : studies){
                    String content = "";

                    content += "Study Name: " + study.getStudyName() + "\n";
                    content += "Patient Name: " + study.getPatientName() + "\n";
                    content += "Study ID: " + study.getStudyID() + "\n";
                    content += "Study Status: " + study.getStudyStatus() + "\n\n";
                    
                    studyIDs.add(study.getStudyID());

                    //ArrayAdapter<Study> listadapter = new ArrayAdapter<String>(patient_list.this, android.R.layout.simple_spinner_item, studies);
                    studyListView.append(content);
                }

                spinner = (Spinner) findViewById(R.id.spinner);
                ArrayAdapter<String> adapter = new ArrayAdapter<>(patient_list.this, android.R.layout.simple_spinner_item, studyIDs);


                for(String i : studyIDs){
                    System.out.print("STUDY ID: " + i + "\n");
                }

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String studyNumber = parent.getItemAtPosition(position).toString();
                        Toast.makeText(parent.getContext(), "Selected: " + studyNumber, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
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
                logout();
                //Intent intent = new Intent(patient_list.this, login_screen.class);
                //startActivity(intent);
            }
        });

        Button confirm = (Button) findViewById(R.id.confirm_button);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patient_list.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void logout() {
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        InterfaceAPI api = retrofit.create(InterfaceAPI.class);

        Call<Void> new_call = api.auth_logout();

        new_call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> new_call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Intent intent = new Intent(patient_list.this, login_screen.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Successfully Logged Out.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Logout Failed.", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<Void> new_call, Throwable t) {
                Log.e("CHECK_LOGOUT", t.toString());
                t.printStackTrace();
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
//}