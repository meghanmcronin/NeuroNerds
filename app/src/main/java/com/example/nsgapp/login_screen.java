package com.example.nsgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Button logout_button = (Button) findViewById(R.id.login);
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_screen.this, patient_list.class);
                startActivity(intent);
            }
        });
    }

    public void OnClickListener(View view) {
        Intent intent = new Intent(login_screen.this, patient_list.class);
        startActivity(intent);
    }
}