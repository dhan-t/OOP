package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GradeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_view);

        GradeEncode.avgCalc avgCalcInGV = new GradeEncode.avgCalc();

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String lastName = sharedPreferences.getString("lname", "");
        String firstName = sharedPreferences.getString("fname", "");
        String middleName = sharedPreferences.getString("mname", "");

        String bach = sharedPreferences.getString("BS/BA", "");
        String course = sharedPreferences.getString("course", "");

        int attendance = sharedPreferences.getInt("ptxtAttdncs", 0);
        int ptxtExam = sharedPreferences.getInt("ptxtExam", 0);
        int ptxtqz1 = sharedPreferences.getInt("ptxtqz1", 0);
        int ptxtqz2 = sharedPreferences.getInt("ptxtqz2", 0);
        int ptxtqz3 = sharedPreferences.getInt("ptxtqz3", 0);
        int ptxtqz4 = sharedPreferences.getInt("ptxtqz4", 0);


        editor.apply();

        String fullName = firstName + " " + middleName + " " + lastName;
        String fullCourse = bach + " " + course;

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

        FullnameGV.setText(fullName);
        CourseGV.setText(fullCourse);
        txtAverageGV.setText(avgCalcInGV.accessAvg(avgAccess));




        Button btnMenu = findViewById(R.id.btnMenuGV);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GradeView.this, Menu.class);
                startActivity(i);
            }
        });
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
