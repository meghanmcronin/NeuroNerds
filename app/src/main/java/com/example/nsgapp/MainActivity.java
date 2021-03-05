package com.example.nsgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logout_button = (Button) findViewById(R.id.viewerLoggoutButton);
        logout_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                logout();
            }
        });

        ImageButton back_button = (ImageButton) findViewById(R.id.backButton);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, patient_list.class);
                startActivity(intent);
            }
        });
    }
    public void onToggle(View view) {
    }

    private void logout() {
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        InterfaceAPI api = retrofit.create(InterfaceAPI.class);

        Call<Void> new_call = api.auth_logout();

        new_call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> new_call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Intent intent = new Intent(MainActivity.this, login_screen.class);
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