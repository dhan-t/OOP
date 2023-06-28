package com.example.finalsoop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class educationalBackground_2ND extends AppCompatActivity {
    private boolean elemcheck = false;
    private boolean secondcheck = false;
    private boolean vocacheck = false;
    private boolean colcheck = false;
    private boolean gradcheck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_background);

        //Instantiate the xml variables.
        CheckBox Elementary = findViewById(R.id.chckbxElementary);
        EditText elemName = findViewById(R.id.etxtElementaryName);
        EditText elemCourse = findViewById(R.id.etxtElementaryCourse);

        CheckBox Secondary = findViewById(R.id.chckbxSecondary);
        EditText secondName = findViewById(R.id.etxtSecondaryName);
        EditText secondCourse = findViewById(R.id.etxtSecondaryCourse);

        CheckBox Vocational = findViewById(R.id.chckbxVocational);
        EditText vocaName = findViewById(R.id.etxtVocationalName);
        EditText vocaCourse = findViewById(R.id.etxtVocationalCourse);

        CheckBox College = findViewById(R.id.chckbxCollege);
        EditText collegeName = findViewById(R.id.etxtCollegeName);
        EditText collegeCourse = findViewById(R.id.etxtCollegeCourse);

        CheckBox GradStud = findViewById(R.id.chckbxGradStud);
        EditText gradstudName = findViewById(R.id.etxtGradClassName);
        EditText gradstudCourse = findViewById(R.id.etxtGradClassCourse);

        Button submit = findViewById(R.id.btnSubmit2nd);
        Button return2nd = findViewById(R.id.btnReturn2nd);


        //USed to check if user has completed schooling in the following:
        Elementary.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    elemcheck = true;
                    elemName.setEnabled(true);
                    elemName.setFocusable(true);
                    elemName.setFocusableInTouchMode(true);

                    elemCourse.setEnabled(true);
                    elemCourse.setFocusable(true);
                    elemCourse.setFocusableInTouchMode(true);
                }
            }
        });

        Secondary.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    secondcheck = true;
                    secondName.setEnabled(true);
                    secondName.setFocusable(true);
                    secondName.setFocusableInTouchMode(true);

                    secondCourse.setEnabled(true);
                    secondCourse.setFocusable(true);
                    secondCourse.setFocusableInTouchMode(true);
                }
            }
        });

        Vocational.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    vocacheck = true;
                    vocaName.setEnabled(true);
                    vocaName.setFocusable(true);
                    vocaName.setFocusableInTouchMode(true);

                    vocaCourse.setEnabled(true);
                    vocaCourse.setFocusable(true);
                    vocaCourse.setFocusableInTouchMode(true);
                }
            }
        });

        College.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    colcheck = true;
                    collegeName.setEnabled(true);
                    collegeName.setFocusable(true);
                    collegeName.setFocusableInTouchMode(true);

                    collegeCourse.setEnabled(true);
                    collegeCourse.setFocusable(true);
                    collegeCourse.setFocusableInTouchMode(true);
                }
            }
        });

        GradStud.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    gradcheck = true;
                    gradstudName.setEnabled(true);
                    gradstudName.setFocusable(true);
                    gradstudName.setFocusableInTouchMode(true);

                    gradstudCourse.setEnabled(true);
                    gradstudCourse.setFocusable(true);
                    gradstudCourse.setFocusableInTouchMode(true);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Checks if user checked atleast one checkbox.
                if (!(elemcheck || secondcheck || vocacheck || colcheck || gradcheck)) {
                    displayToast("Please fill up at least one checkbox");
                } else {
                    displayToast("Educational background successfully submitted!\nDirecting you to the next page...");

                    Intent personalInfo = getIntent();
                    String firstname = personalInfo.getStringExtra("firstname");
                    String lastname = personalInfo.getStringExtra("lastname");
                    String midname = personalInfo.getStringExtra("midname");
                    String email = personalInfo.getStringExtra("email");
                    String height = personalInfo.getStringExtra("height");
                    String weight = personalInfo.getStringExtra("weight");
                    String Pagibig = personalInfo.getStringExtra("Pagibig");
                    String Philhealth = personalInfo.getStringExtra("Philhealth");
                    String GSIS = personalInfo.getStringExtra("GSIS");
                    String TIN = personalInfo.getStringExtra("TIN");
                    String gender = personalInfo.getStringExtra("gender");
                    String civil = personalInfo.getStringExtra("civil");
                    String ename = personalInfo.getStringExtra("ename");
                    String enumb = personalInfo.getStringExtra("enumb");
                    String phonnum = personalInfo.getStringExtra("phonnum");
                    String selectedRes = personalInfo.getStringExtra("selectedERes");

                    byte[] img = personalInfo.getByteArrayExtra("photoArray");
                    Bitmap picfrom1 = BitmapFactory.decodeByteArray(img, 0, img.length);

                    Intent educInfo = new Intent(educationalBackground_2ND.this, criminalBackground_3RD.class);

                    if (!elemcheck) {
                        String elemname = "n/a";
                        String elemeducation = "n/a";
                        educInfo.putExtra("Elem", elemname);
                        educInfo.putExtra("ElemEduc", elemeducation);
                    } else {
                        String elemname = elemName.getText().toString().trim();
                        String elemeducation = elemCourse.getText().toString().trim();
                        educInfo.putExtra("Elem", elemname);
                        educInfo.putExtra("ElemEduc", elemeducation);
                    }

                    if (!secondcheck) {
                        String secondname = "n/a";
                        String secondeducation = "n/a";
                        educInfo.putExtra("Secondary", secondname);
                        educInfo.putExtra("SecondaryEduc", secondeducation);
                    } else {
                        String secondname = secondName.getText().toString().trim();
                        String secondeducation = secondCourse.getText().toString().trim();
                        educInfo.putExtra("Secondary", secondname);
                        educInfo.putExtra("SecondaryEduc", secondeducation);
                    }

                    if (!vocacheck) {
                        String vocaname = "n/a";
                        String vocacourse = "n/a";
                        educInfo.putExtra("Vocationname", vocaname);
                        educInfo.putExtra("VocationCourse", vocacourse);
                    } else {
                        String vocaname = vocaName.getText().toString().trim();
                        String vocacourse = vocaCourse.getText().toString().trim();
                        educInfo.putExtra("Vocationname", vocaname);
                        educInfo.putExtra("VocationCourse", vocacourse);
                    }

                    if (!colcheck) {
                        String collegename = "n/a";
                        String collegecourse = "n/a";
                        educInfo.putExtra("College", collegename);
                        educInfo.putExtra("CollegeCourse", collegecourse);
                    } else {
                        String collegename = collegeName.getText().toString().trim();
                        String collegecourse = collegeCourse.getText().toString().trim();
                        educInfo.putExtra("College", collegename);
                        educInfo.putExtra("CollegeCourse", collegecourse);
                    }

                    if (!gradcheck) {
                        String gradstudname = "n/a";
                        String gradstudcourse = "n/a";
                        educInfo.putExtra("GradStudy", gradstudname);
                        educInfo.putExtra("GradStudyCourse", gradstudcourse);
                    } else {
                        String gradstudname = gradstudName.getText().toString().trim();
                        String gradstudcourse = gradstudCourse.getText().toString().trim();
                        educInfo.putExtra("GradStudy", gradstudname);
                        educInfo.putExtra("GradStudyCourse", gradstudcourse);
                    }

                    educInfo.putExtra("firstname", firstname);
                    educInfo.putExtra("lastname", lastname);
                    educInfo.putExtra("midname", midname);
                    educInfo.putExtra("email", email);
                    educInfo.putExtra("height", height);
                    educInfo.putExtra("weight", weight);
                    educInfo.putExtra("Pagibig", Pagibig);
                    educInfo.putExtra("Philhealth", Philhealth);
                    educInfo.putExtra("GSIS", GSIS);
                    educInfo.putExtra("TIN", TIN);
                    educInfo.putExtra("gender", gender);
                    educInfo.putExtra("civil", civil);
                    educInfo.putExtra("ename", ename);
                    educInfo.putExtra("enumb", enumb);
                    educInfo.putExtra("phonnum", phonnum);
                    educInfo.putExtra("selectedERes", selectedRes);

                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    picfrom1.compress(Bitmap.CompressFormat.PNG, 100, stream);
                    byte[] byteArray = stream.toByteArray();
                    educInfo.putExtra("bitmap", byteArray);

                    startActivity(educInfo);
                }
            }
        });

        return2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent return2 = new Intent(educationalBackground_2ND.this, personalBackground_HP.class);
                startActivity(return2);
            }
        });

    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
