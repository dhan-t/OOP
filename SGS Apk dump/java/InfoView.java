package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.june5_oop.ui.userInputRetainer;

public class InfoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view);

        userInputRetainer inputRetainer = userInputRetainer.getInstance();

        TextView contacts = findViewById(R.id.txtContact);
        TextView age1 = findViewById(R.id.txtAge);
        TextView fullCourseTextView = findViewById(R.id.txtCourseInfo);
        TextView yrlvl = findViewById(R.id.txtYearLVL);
        TextView fullname = findViewById(R.id.txtFullName);

        String fullName = inputRetainer.fullNameUIR();
        String contact = String.valueOf(inputRetainer.getContactNum());
        int birthYear = inputRetainer.ageCalcUIR();
        String fullcourse = inputRetainer.fullCourseUIR();
        String yrLvl = inputRetainer.getYrLvl();

        fullname.setText(fullName);
        contacts.setText(contact);
        age1.setText(String.valueOf(birthYear));
        fullCourseTextView.setText(fullcourse);
        yrlvl.setText(String.valueOf(yrLvl));


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

        Button compute = findViewById(R.id.btnComputeIV);
        compute.setOnClickListener(v -> {
            Intent i = new Intent(InfoView.this, GradeEncode.class);
            startActivity(i);
        });
    }
}
