package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.june5_oop.ui.userInputRetainer;

public class GradeEncode extends AppCompatActivity {
    private userInputRetainer inputRetainer;
    private List<EditText> fieldCheckerG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_encode);

        inputRetainer = userInputRetainer.getInstance();

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

        if (InfoEncode.UserSession.loggedIn) {
            displayToast("User info encoded!");
            lnameg.setText(userInputRetainer.getInstance().LNameOnly());
            fnameg.setText(userInputRetainer.getInstance().FNameOnly());
            mnameg.setText(userInputRetainer.getInstance().MNameOnly());
        } else {
            displayToast("User info not encoded.");
        }

        Button computeGRD = findViewById(R.id.btnCompute);
        computeGRD.setOnClickListener(v -> {
            boolean fieldEmpty = false;
            boolean inputCheck = false;

            for (EditText field : fieldCheckerG) {
                String userInput = field.getText().toString().trim();
                if (userInput.isEmpty()) {
                    fieldEmpty = true;
                    break;
                }
            }
            for (EditText field : fieldCheckerG) {
                String userInput = field.getText().toString().trim();
                int inputNumber = Integer.parseInt(userInput);
                if (inputNumber <= 1 || inputNumber >= 100) {
                    inputCheck = true;
                    break;
                }
            }

            if (fieldEmpty) {
                displayToast("Please input all fields!");
            } else if (inputCheck) {
                displayToast("Please check grade inputs. ");
            } else {

                try {
                inputRetainer.fullNameCons(fnameg.getText().toString().trim(), mnameg.getText().toString().trim(), lnameg.getText().toString().trim());
                inputRetainer.averageCalcCons(Integer.parseInt(absnt.getText().toString().trim()), Integer.parseInt(exam.getText().toString().trim()), Integer.parseInt(qz1.getText().toString().trim()), Integer.parseInt(qz2.getText().toString().trim()), Integer.parseInt(qz3.getText().toString().trim()), Integer.parseInt(qz4.getText().toString().trim()));
                displayToast("Computing grades...");

                }catch (Exception e){
                    e.printStackTrace();
                }
                Intent i = new Intent(GradeEncode.this, GradeView.class);
                startActivity(i);
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
