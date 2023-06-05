package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GradeEncode extends AppCompatActivity {

    private List<EditText> fieldCheckerG;

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

        fieldCheckerG = new ArrayList<>();
        fieldCheckerG.add(lnameg);
        fieldCheckerG.add(fnameg);
        fieldCheckerG.add(mnameg);
        fieldCheckerG.add(absnt);
        fieldCheckerG.add(exam);
        fieldCheckerG.add(qz1);
        fieldCheckerG.add(qz2);
        fieldCheckerG.add(qz3);
        fieldCheckerG.add(qz4);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String lastName = lnameg.getText().toString().trim();
        String firstName = fnameg.getText().toString().trim();
        String middleName = mnameg.getText().toString().trim();

        int attendance = Integer.parseInt(absnt.getText().toString().trim());
        int examGrade = Integer.parseInt(exam.getText().toString().trim());
        int quiz1Grade = Integer.parseInt(qz1.getText().toString().trim());
        int quiz2Grade = Integer.parseInt(qz2.getText().toString().trim());
        int quiz3Grade = Integer.parseInt(qz3.getText().toString().trim());
        int quiz4Grade = Integer.parseInt(qz4.getText().toString().trim());

        Button computeGRD = findViewById(R.id.btnCompute);
        computeGRD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean fieldEmpty = false;

                for (EditText field : fieldCheckerG) {
                    String userInput = field.getText().toString().trim();

                    if (userInput.isEmpty()) {
                        fieldEmpty = true;
                        break;
                    }
                }

                if (fieldEmpty) {
                    displayToast("Please input all fields!");
                } else {


                    int quizAverage = (quiz1Grade + quiz2Grade + quiz3Grade + quiz4Grade) / 4;
                    double average = (attendance * 0.2) + (quizAverage * 0.3) + (examGrade * 0.5);

                    editor.putInt("ptxtAttdncs", attendance);
                    editor.putInt("ptxtExam", examGrade);
                    editor.putInt("ptxtqz1", quiz1Grade);
                    editor.putInt("ptxtqz2", quiz2Grade);
                    editor.putInt("ptxtqz3", quiz3Grade);
                    editor.putInt("ptxtqz4", quiz4Grade);
                    editor.apply();

                    displayToast("Computing grades...");

                    Intent i = new Intent(GradeEncode.this, GradeView.class);
                    startActivity(i);
                }
            }
        });

        Button btnMenu = findViewById(R.id.btnMENUBTN);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GradeEncode.this, Menu.class);
                startActivity(i);
            }
        });
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    public static class avgCalc {
        public void accessAvg(double average) {
            double avgAccess;
            return avgAccess = average;
        }
    }
}
