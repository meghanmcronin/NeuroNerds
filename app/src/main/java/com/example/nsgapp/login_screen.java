package com.example.nsgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.gson.Gson;

import java.util.List;

import okhttp3.Headers;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class login_screen extends AppCompatActivity {
    private Button button;
    private EditText userTxt, passTxt;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        button = findViewById(R.id.loginButton);
        userTxt = findViewById(R.id.username);
        passTxt = findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = userTxt.getText().toString();
                password = passTxt.getText().toString();
                Log.d("USERNAME = ", username);
                Log.d("PASSWORD", password);
                login();
            }
        });
    }


    private void login() {
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        InterfaceAPI api = retrofit.create(InterfaceAPI.class);

        LoginRequest loginRequest = new LoginRequest(username, password);

        String base = username + ":" + password;
        String authHeader = "Basic " + Base64.encodeToString(base.getBytes(), Base64.NO_WRAP);
        Log.d("AUTHHEADER ", authHeader);
        Call<LoginResponse> call = api.auth_login(authHeader, loginRequest);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Successfully Logged In.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(login_screen.this, patient_list.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials.", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.e("CHECK_LOGIN", t.toString());
                t.printStackTrace();
            }
        });
    }
}