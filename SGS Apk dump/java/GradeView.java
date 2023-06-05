package com.example.june5_oop;

import com.example.june5_oop.ui.userInputRetainer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GradeView extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_view);

        userInputRetainer inputRetainer = userInputRetainer.getInstance();

        TextView FullnameGV = findViewById(R.id.txtFullNameGV);
        TextView CourseGV = findViewById(R.id.txtCourseGV);
        TextView txtAverageGV = findViewById(R.id.txtAverageGV);
        TextView txtStatusGV = findViewById(R.id.txtStatusGV);
        TextView txtExamGV = findViewById(R.id.txtExamGV);
        TextView txtQz1GV = findViewById(R.id.txtQz1GV);
        TextView txtQz2GV = findViewById(R.id.txtQz2GV);
        TextView txtQz3GV = findViewById(R.id.txtQz3GV);
        TextView txtQz4GV = findViewById(R.id.txtQz4GV);
        TextView txtAttendanceGV = findViewById(R.id.txtAttendanceGV);
        TextView txtRemarks = findViewById(R.id.txtRemarks);

        String fullname = String.valueOf(inputRetainer.fullNameUIR());
        String fullcourse = String.valueOf(inputRetainer.fullCourseUIR());
        String average = String.valueOf(inputRetainer.aveCompute());
        String exams = String.valueOf(inputRetainer.examOnly());
        String qz1 = String.valueOf(inputRetainer.qz1Only());
        String qz2 = String.valueOf(inputRetainer.qz2Only());
        String qz3 = String.valueOf(inputRetainer.qz3Only());
        String qz4 = String.valueOf(inputRetainer.qz4Only());
        String attendance = String.valueOf(inputRetainer.attendanceOnly());
        String remarks = String.valueOf(inputRetainer.remarks());
        String passOrFail = String.valueOf(inputRetainer.passOrFail());

        txtStatusGV.setText("Status: " + passOrFail);
        txtRemarks.setText("Remarks: " + remarks);
        FullnameGV.setText(fullname);
        CourseGV.setText(fullcourse);
        txtAverageGV.setText("Average: " + average);
        txtExamGV.setText("Exams: " + exams);
        txtQz1GV.setText("Quiz 1: " + qz1);
        txtQz2GV.setText("Quiz 2: " + qz2);
        txtQz3GV.setText("Quiz 3: " + qz3);
        txtQz4GV.setText("Quiz 4: " + qz4);
        txtAttendanceGV.setText("Attendance: " + attendance);

        Button btnMenu = findViewById(R.id.btnMenuGV);
        btnMenu.setOnClickListener(v -> {
            Intent i = new Intent(GradeView.this, Menu.class);
            startActivity(i);
        });
    }
}
