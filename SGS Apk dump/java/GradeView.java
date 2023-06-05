package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GradeView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_view);
        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstname");
        String middleName = intent.getStringExtra("midname");
        String lastName = intent.getStringExtra("lastname");

        int attendance = intent.getIntExtra("attendance", 0);
        int exams = intent.getIntExtra("exams", 0);
        int quiz1 = intent.getIntExtra("quiz1", 0);
        int quiz2 = intent.getIntExtra("quiz2", 0);
        int quiz3 = intent.getIntExtra("quiz3", 0);
        int quiz4 = intent.getIntExtra("quiz4", 0);

        TextView FullnameGV = findViewById(R.id.txtFullNameGV);
        FullnameGV.setText(firstName + " " + middleName + " " + lastName);

        double convertedAve = average(attendance, exams, quiz1, quiz2, quiz3, quiz4);
        TextView txtAverageGV = findViewById(R.id.txtAverageGV);
        txtAverageGV.setText("Average: " + String.valueOf(convertedAve));

        TextView txtStatusGV = findViewById(R.id.txtStatusGV);
        txtStatusGV.setText("Status: " + passOrFail(convertedAve));

        TextView txtExamGV = findViewById(R.id.txtExamGV);
        txtExamGV.setText("Exam: " + String.valueOf(exams));

        TextView txtQz1GV = findViewById(R.id.txtQz1GV);
        txtQz1GV.setText("Quiz 1: " + String.valueOf(quiz1));

        TextView txtQz2GV = findViewById(R.id.txtQz2GV);
        txtQz2GV.setText("Quiz 2: " + String.valueOf(quiz2));

        TextView txtQz3GV = findViewById(R.id.txtQz3GV);
        txtQz3GV.setText("Quiz 3: " + String.valueOf(quiz3));

        TextView txtQz4GV = findViewById(R.id.txtQz4GV);
        txtQz4GV.setText("Quiz 4: " + String.valueOf(quiz4));

        TextView txtAttendanceGV = findViewById(R.id.txtAttendanceGV);
        txtAttendanceGV.setText("Attendance: " + String.valueOf(attendance));

        TextView txtRemarks = findViewById(R.id.txtRemarks);
        txtRemarks.setText("Remarks: " + remarksResult(convertedAve));

        Button btnMenu = findViewById(R.id.btnMenuGV);
        btnMenu.setOnClickListener(v -> {
            Intent i = new Intent(GradeView.this, Menu.class);
            startActivity(i);
        });
    }

    private double average(int attendance, int exams, int quiz1, int quiz2, int quiz3, int quiz4) {
        int quizAverage = ((quiz1) + (quiz2) + (quiz3) + (quiz4)) / 4;
        double averageCalc = ((attendance) * 0.2) + (quizAverage * 0.3) + ((exams) * 0.5);

        return averageCalc;
    }

    private String remarksResult (double averagerr){
        String remarks;
    if (averagerr >= 96 && averagerr <= 100) {
            remarks = "4.00";
        } else if (averagerr >= 90 && averagerr <= 95) {
            remarks = "3.50";
        } else if (averagerr >= 84 && averagerr <= 89) {
            remarks = "3.00";
        } else if (averagerr >= 78 && averagerr <= 83) {
            remarks = "2.50";
        } else if (averagerr >= 72 && averagerr <= 77) {
            remarks = "2.00";
        } else if (averagerr >= 66 && averagerr <= 71) {
            remarks = "1.50";
        } else if (averagerr >= 60 && averagerr <= 65) {
            remarks = "1.00";
        } else {
            remarks = "INC";
        }
        return remarks;
    }

    private String passOrFail(double averagepof){
        String passorfail;

        if (averagepof >= 60) {
            passorfail = "Passed";
        } else {
            passorfail = "Fail";
        }
        return passorfail;
    }
}
