package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class InfoView extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view);

        Intent intent = getIntent();

        // Retrieve the user input from the Intent extras
        String firstName = intent.getStringExtra("firstname");
        String middleName = intent.getStringExtra("midname");
        String lastName = intent.getStringExtra("lastname");
        String email = intent.getStringExtra("Email");
        String babs = intent.getStringExtra("BABS");
        String course = intent.getStringExtra("Course");
        String yrLVL = intent.getStringExtra("yrlvl");

        String contactnum = intent.getStringExtra("contactNum");
        String birthyear = intent.getStringExtra("birthYear");

        TextView fullNameTextView = findViewById(R.id.txtFullName2);
        fullNameTextView.setText(firstName + " " + middleName + " " + lastName);

        TextView contactNum = findViewById(R.id.txtContact);
        contactNum.setText(contactnum);

        TextView email1 = findViewById(R.id.txtEmail);
        email1.setText(email);

        TextView fullcourse = findViewById(R.id.txtCourseInfo);
        fullcourse.setText(babs.toUpperCase() + " " + course + " Year " + yrLVL);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String ageCalc = String.valueOf(currentYear - Integer.parseInt(birthyear));

        TextView age = findViewById(R.id.txtAge);
        age.setText(ageCalc + " y/o");

        Button home = findViewById(R.id.btnHome);
        home.setOnClickListener(v -> {
            Intent i = new Intent(InfoView.this, Menu.class);
            startActivity(i);
        });

        Button editInfo = findViewById(R.id.btnEditInfo);
        editInfo.setOnClickListener(v -> {
            Intent i = new Intent(InfoView.this, InfoEncode.class);
            startActivity(i);
        });

    }
}
