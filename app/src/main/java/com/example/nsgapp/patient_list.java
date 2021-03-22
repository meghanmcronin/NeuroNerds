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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.example.nsgapp.R.layout.activity_patient_list;

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

        Call<ResponseBody> nifti = api.downloadNifti();
        nifti.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Log.d("exists", "server contacted and has file");

                    boolean writtenToDisk = writeResponseBodyToDisk(response.body());

                    Log.d("downloaded", "file download was a success? " + writtenToDisk);
                }
                else {
                    Log.d("failure", "server contact failed");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e("error", "error");
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

    private boolean writeResponseBodyToDisk(ResponseBody body) {
        try {
            File niftiFile = new File(getExternalFilesDir("studies?studyID=num") + File.separator + "test-download.nii");

            InputStream inputStream = null;
            OutputStream outputStream = null;

            try {
                byte[] fileReader = new byte[4096];

                long fileSize = body.contentLength();
                long fileSizeDownloaded = 0;

                inputStream = body.byteStream();
                outputStream = new FileOutputStream(niftiFile);

                while (true) {
                    int read = inputStream.read(fileReader);

                    if (read == -1) {
                        break;
                    }

                    outputStream.write(fileReader, 0, read);

                    fileSizeDownloaded += read;

                    Log.d("downloaded", "file download: " + fileSizeDownloaded + " of " + fileSize);
                }

                outputStream.flush();

                return true;
            } catch (IOException e) {
                return false;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            return false;
        }
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
}