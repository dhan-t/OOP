package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class InfoEncode extends AppCompatActivity {

    private List<EditText> fieldChecker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inforencoder);

        EditText lname = findViewById(R.id.ptxtLName);
        EditText fname = findViewById(R.id.ptxtFName);
        EditText mname = findViewById(R.id.ptxtMName);
        EditText email = findViewById(R.id.ptxtEmail);

        EditText brtYR = findViewById(R.id.ptxtBrtYear);
        EditText cnctN = findViewById(R.id.ptxtContact2);

        EditText bsba = findViewById(R.id.ptxtBABS);
        EditText course = findViewById(R.id.ptxtCourse);
        EditText yrLVL = findViewById(R.id.ptxtYrLvl);

        fieldChecker = new ArrayList<>();
        fieldChecker.add(lname);
        fieldChecker.add(fname);
        fieldChecker.add(mname);
        fieldChecker.add(brtYR);
        fieldChecker.add(cnctN);
        fieldChecker.add(bsba);
        fieldChecker.add(course);
        fieldChecker.add(yrLVL);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Button submitBTN = findViewById(R.id.btnSBMT);
        submitBTN.setOnClickListener(v -> {
            boolean fieldEmpty = false;

            for (EditText field : fieldChecker) {
                String userInput = field.getText().toString().trim();
                if (userInput.isEmpty()) {
                    fieldEmpty = true;
                    break;
                }
            }
            if (fieldEmpty) {
                displayToast("Please input all fields!");
            } else {

                try {

                    String lastname = lname.getText().toString().trim();
                    String firstname = fname.getText().toString().trim();
                    String midname = mname.getText().toString().trim();
                    String Email = email.getText().toString().trim();

                    String birthYear = brtYR.getText().toString().trim();
                    String contactNum = cnctN.getText().toString().trim();

                    String BABS = bsba.getText().toString().trim();
                    String Course = course.getText().toString().trim();
                    String yrlvl = yrLVL.getText().toString().trim();

                    Intent intent = new Intent(InfoEncode.this, InfoView.class);
                    intent.putExtra("firstname", firstname);
                    intent.putExtra("midname", midname);
                    intent.putExtra("lastname", lastname);
                    intent.putExtra("Email", Email);

                    intent.putExtra("birthYear", birthYear);
                    intent.putExtra("contactNum", contactNum);

                    intent.putExtra("BABS", BABS);
                    intent.putExtra("Course", Course);
                    intent.putExtra("yrlvl", yrlvl);

                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                displayToast("Information Submitted!");
            }
        });

        Button btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(v -> {
            Intent i = new Intent(InfoEncode.this, Menu.class);
            startActivity(i);
        });

    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}
