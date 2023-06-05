package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GradeEncode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_encode);

        EditText lnameg = findViewById(R.id.ptxtLNameG);
        EditText fnameg = findViewById(R.id.ptxtFNameG);
        EditText mnameg = findViewById(R.id.ptxtMNameG);

        EditText absnt = findViewById(R.id.ptxtAttdncs);
        EditText exam = findViewById(R.id.ptxtExam);
        EditText qz1 = findViewById(R.id.ptxtqz1);
        EditText qz2 = findViewById(R.id.ptxtqz2);
        EditText qz3 = findViewById(R.id.ptxtqz3);
        EditText qz4 = findViewById(R.id.ptxtqz4);

        Button computeGRD = findViewById(R.id.btnCompute);
        computeGRD.setOnClickListener(v -> {
            String lastname = lnameg.getText().toString().trim();
            String firstname = fnameg.getText().toString().trim();
            String midname = mnameg.getText().toString().trim();

            String attendanceStr = absnt.getText().toString().trim();
            String examsStr = exam.getText().toString().trim();
            String quiz1Str = qz1.getText().toString().trim();
            String quiz2Str = qz2.getText().toString().trim();
            String quiz3Str = qz3.getText().toString().trim();
            String quiz4Str = qz4.getText().toString().trim();

            if (lastname.isEmpty() || firstname.isEmpty() || midname.isEmpty() || attendanceStr.isEmpty() || examsStr.isEmpty() || quiz1Str.isEmpty() || quiz2Str.isEmpty() || quiz3Str.isEmpty() || quiz4Str.isEmpty()) {
                displayToast("Please input all fields!");
            } else {
                try {
                    int attendance = Integer.parseInt(attendanceStr);
                    int exams = Integer.parseInt(examsStr);
                    int quiz1 = Integer.parseInt(quiz1Str);
                    int quiz2 = Integer.parseInt(quiz2Str);
                    int quiz3 = Integer.parseInt(quiz3Str);
                    int quiz4 = Integer.parseInt(quiz4Str);

                    Intent intent = new Intent(GradeEncode.this, GradeView.class);
                    intent.putExtra("firstname", firstname);
                    intent.putExtra("midname", midname);
                    intent.putExtra("lastname", lastname);
                    intent.putExtra("attendance", attendance);
                    intent.putExtra("exams", exams);
                    intent.putExtra("quiz1", quiz1);
                    intent.putExtra("quiz2", quiz2);
                    intent.putExtra("quiz3", quiz3);
                    intent.putExtra("quiz4", quiz4);

                    startActivity(intent);
                } catch (NumberFormatException e) {
                    displayToast("Invalid input. Please enter valid numbers.");
                }
            }
        });

            Button btnMenu = findViewById(R.id.btnMENUBTN);
        btnMenu.setOnClickListener(v -> {
            Intent i = new Intent(GradeEncode.this, Menu.class);
            startActivity(i);
        });
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
