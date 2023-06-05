package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoView extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        String lastName = sharedPreferences.getString("lname", "");
        String firstName = sharedPreferences.getString("fname", "");
        String middleName = sharedPreferences.getString("mname", "");
        int contact = sharedPreferences.getInt("contact", 0);
        int bday = sharedPreferences.getInt("bday", 0);
        String bach = sharedPreferences.getString("BS/BA", "");
        String course = sharedPreferences.getString("course", "");
        String yearlvl = sharedPreferences.getString("yrlvl", "");

        String age = ((2023 - bday) + " y/o");

        String fullName = firstName + " " + middleName + " " + lastName;

        TextView contacts = findViewById(R.id.txtContact);
        TextView age1 = findViewById(R.id.txtAge);
        TextView fullCourseTextView = findViewById(R.id.txtCourseInfo);
        TextView yrlvl = findViewById(R.id.txtYearLVL);
        TextView fullname = findViewById(R.id.txtFullName);

        fullname.setText(fullName);
        contacts.setText(String.valueOf(contact));
        age1.setText(String.valueOf(age));
        fullCourseTextView.setText(bach + " " + course + " year" + yearlvl);

        Button home = findViewById(R.id.btnHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfoView.this, Menu.class);
                startActivity(i);
            }
        });

        Button editInfo = findViewById(R.id.btnEditInfo);
        editInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfoView.this, InfoEncode.class);
                startActivity(i);
            }
        });

        Button compute = findViewById(R.id.btnComputeIV);
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfoView.this, GradeEncode.class);
                startActivity(i);
            }
        });
    }
}
