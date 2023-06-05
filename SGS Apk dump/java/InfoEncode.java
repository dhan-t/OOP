package com.example.june5_oop;

import com.example.june5_oop.ui.userInputRetainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import kotlinx.coroutines.debug.internal.StackTraceFrame;

public class InfoEncode extends AppCompatActivity {

    private List<EditText> fieldChecker;
    private userInputRetainer inputRetainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inforencoder);

        EditText lname = findViewById(R.id.ptxtLName);
        EditText fname = findViewById(R.id.ptxtFName);
        EditText mname = findViewById(R.id.ptxtMName);

        EditText brtYR = findViewById(R.id.ptxtBrtYear);
        EditText cnctN = findViewById(R.id.ptxtContact2);

        EditText bsba = findViewById(R.id.ptxtBABS);
        EditText course = findViewById(R.id.ptxtCourse);
        EditText yrLVL = findViewById(R.id.ptxtYrLvl);


        InputFilter[] filters = new InputFilter[1];
        filters[0] = new InputFilter.LengthFilter(15); // Set the desired character limit here

        cnctN.setFilters(filters);

        fieldChecker = new ArrayList<>();
        fieldChecker.add(lname);
        fieldChecker.add(fname);
        fieldChecker.add(mname);

        fieldChecker.add(brtYR);
        fieldChecker.add(cnctN);

        fieldChecker.add(bsba);
        fieldChecker.add(course);
        fieldChecker.add(yrLVL);

        inputRetainer = userInputRetainer.getInstance();


        String input = cnctN.getText().toString();
        try {
            long number = Long.parseLong(input);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

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
                    inputRetainer.fullNameCons(fname.getText().toString().trim(), mname.getText().toString().trim(), lname.getText().toString().trim());
                    inputRetainer.getContactNum();
                    inputRetainer.birthYear();
                    inputRetainer.fullCourseCons(bsba.getText().toString().trim(), course.getText().toString().trim(), Integer.parseInt(yrLVL.getText().toString().trim()));


                    UserSession.loggedIn = true;

                    Intent i = new Intent(InfoEncode.this, InfoView.class);
                    startActivity(i);
                }catch (Exception e){
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

    public static class UserSession {
        public static boolean loggedIn = false;
    }
}
