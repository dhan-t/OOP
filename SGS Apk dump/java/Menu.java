package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> {
            Intent i = new Intent(Menu.this, LoginPage.class);
            startActivity(i);
        });

        Button btnEncInf = findViewById(R.id.btnEncInf);
        btnEncInf.setOnClickListener(v -> {
            Intent i = new Intent(Menu.this, InfoEncode.class);
            startActivity(i);
        });

        Button btnEncGr = findViewById(R.id.btnEncGrd);
        btnEncGr.setOnClickListener(v -> {
            Intent i = new Intent(Menu.this, GradeEncode.class);
            startActivity(i);
        });
    }
}
