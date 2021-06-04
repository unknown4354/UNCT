package com.androidjson.unct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectMode extends AppCompatActivity {

    Button ClientService = findViewById(R.id.client);
    Button TransporterService = findViewById(R.id.transporter);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);

        ClientService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectMode.this, Splash.class));
            }
        });

        ClientService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectMode.this, Profile.class));
            }
        });

    }
}