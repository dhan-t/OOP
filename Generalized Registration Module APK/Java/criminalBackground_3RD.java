package com.example.finalsoop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class criminalBackground_3RD extends AppCompatActivity {

    private boolean q1yes = false;
    private boolean q2yes = false;
    private boolean q3yes = false;

    private boolean q4ayes = false;
    private boolean q4byes = false;
    private boolean q4cyes = false;

    private String yes1;
    private String yes2;
    private String yes3;
    private String yes4a;
    private String yes4b;
    private String yes4c;

    private EditText yesq1, yesq2, yesq3, yesq4a, yesq4b, yesq4c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_background);

        //Instantiates variables from xml file.
        CheckBox q1y = findViewById(R.id.chckbxYES1);
        CheckBox q1n = findViewById(R.id.chckbxNO1);

        CheckBox q2y = findViewById(R.id.chckbxYES2);
        CheckBox q2n = findViewById(R.id.chckbxNO2);

        CheckBox q3y = findViewById(R.id.chckbxYES3);
        CheckBox q3n = findViewById(R.id.chckbxNO3);

        CheckBox q4ay = findViewById(R.id.chckbxYES4a);
        CheckBox q4an = findViewById(R.id.chckbxNO4a);

        CheckBox q4by = findViewById(R.id.chckbxYES4b);
        CheckBox q4bn = findViewById(R.id.chckbxNO4b);

        CheckBox q4cy = findViewById(R.id.chckbxYES4c);
        CheckBox q4cn = findViewById(R.id.chckbxNO4c);

        Button submit = findViewById(R.id.btnSubmit3rd);
        Button return3rd = findViewById(R.id.btnReturn3rd);

        yesq1 = findViewById(R.id.etxtQ1);
        yesq2 = findViewById(R.id.etxtQ2);
        yesq3 = findViewById(R.id.etxtQ3);
        yesq4a = findViewById(R.id.etxtQ4a);
        yesq4b = findViewById(R.id.etxtQ4b);
        yesq4c = findViewById(R.id.etxtQ4c);

        //For checkbox checking.
        q1y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q1n.setChecked(false);
                    q1yes = true;

                    yesq1.setEnabled(true);
                    yesq1.setFocusable(true);
                    yesq1.setFocusableInTouchMode(true);
                }
            }
        });

        q1n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q1y.setChecked(false);
                }
            }
        });

        q2y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q2n.setChecked(false);
                    q2yes = true;

                    yesq2.setEnabled(true);
                    yesq2.setFocusable(true);
                    yesq2.setFocusableInTouchMode(true);
                }
            }
        });

        q2n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q2y.setChecked(false);
                }
            }
        });

        q3y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q3n.setChecked(false);
                    q3yes = true;

                    yesq3.setEnabled(true);
                    yesq3.setFocusable(true);
                    yesq3.setFocusableInTouchMode(true);
                }
            }
        });

        q3n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q3y.setChecked(false);
                }
            }
        });

        q4ay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4an.setChecked(false);
                    q4ayes = true;

                    yesq4a.setEnabled(true);
                    yesq4a.setFocusable(true);
                    yesq4a.setFocusableInTouchMode(true);
                }
            }
        });

        q4an.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4ay.setChecked(false);
                }
            }
        });

        q4by.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4bn.setChecked(false);
                    q4byes = true;

                    yesq4b.setEnabled(true);
                    yesq4b.setFocusable(true);
                    yesq4b.setFocusableInTouchMode(true);
                }
            }
        });

        q4bn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4by.setChecked(false);
                }
            }
        });

        q4cy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4cn.setChecked(false);
                    q4cyes = true;
                    yesq4c.setEnabled(true);
                    yesq4c.setFocusable(true);
                }
            }
        });

        q4cn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    q4cy.setChecked(false);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                Intent educInfo = getIntent();
                String Elem = educInfo.getStringExtra("Elem");
                String ElemEduc = educInfo.getStringExtra("ElemEduc");
                String Secondary = educInfo.getStringExtra("Secondary");
                String SecondaryEduc = educInfo.getStringExtra("SecondaryEduc");
                String Vocationname = educInfo.getStringExtra("Vocationname");
                String VocationCourse = educInfo.getStringExtra("VocationCourse");
                String College = educInfo.getStringExtra("College");
                String CollegeCourse = educInfo.getStringExtra("CollegeCourse");
                String GradStudy = educInfo.getStringExtra("GradStudy");
                String GradStudyCourse = educInfo.getStringExtra("GradStudyCourse");

                //Photo processing.
                byte[] picfrom1 = educInfo.getByteArrayExtra("bitmap");
                Bitmap picfrom2 = BitmapFactory.decodeByteArray(picfrom1, 0, picfrom1.length);

                //Notification feature.
                String channelID = "CHANNEL_ID_NOTIFICATION";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), channelID);
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setContentTitle("Encoded Successfully.");
                builder.setContentText("Click this notification to view your report.");
                builder.setAutoCancel(true);
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

                Intent combinedIntent = new Intent(criminalBackground_3RD.this, reportResults_4TH.class);
                combinedIntent.putExtra("firstname", firstname);
                combinedIntent.putExtra("lastname", lastname);
                combinedIntent.putExtra("midname", midname);
                combinedIntent.putExtra("email", email);
                combinedIntent.putExtra("height", height);
                combinedIntent.putExtra("weight", weight);
                combinedIntent.putExtra("Pagibig", Pagibig);
                combinedIntent.putExtra("Philhealth", Philhealth);
                combinedIntent.putExtra("GSIS", GSIS);
                combinedIntent.putExtra("TIN", TIN);
                combinedIntent.putExtra("gender", gender);
                combinedIntent.putExtra("civil", civil);

                combinedIntent.putExtra("ename", ename);
                combinedIntent.putExtra("enumb", enumb);
                combinedIntent.putExtra("phonnum", phonnum);
                combinedIntent.putExtra("selectedERes", selectedRes);

                combinedIntent.putExtra("Elem", Elem);
                combinedIntent.putExtra("ElemEduc", ElemEduc);
                combinedIntent.putExtra("Secondary", Secondary);
                combinedIntent.putExtra("SecondaryEduc", SecondaryEduc);
                combinedIntent.putExtra("Vocationname", Vocationname);
                combinedIntent.putExtra("VocationCourse", VocationCourse);
                combinedIntent.putExtra("College", College);
                combinedIntent.putExtra("CollegeCourse", CollegeCourse);
                combinedIntent.putExtra("GradStudy", GradStudy);
                combinedIntent.putExtra("GradStudyCourse", GradStudyCourse);

                //To assign values depending on what user checks out.
                if (q1yes) {
                    yes1 = yesq1.getText().toString().trim();
                } else {
                    yes1 = "No";
                }

                if (q2yes) {
                    yes2 = yesq2.getText().toString().trim();
                } else {
                    yes2 = "No";
                }

                if (q3yes) {
                    yes3 = yesq3.getText().toString().trim();
                } else {
                    yes3 = "No";
                }

                if (q4ayes) {
                    yes4a = yesq4a.getText().toString().trim();
                } else {
                    yes4a = "No";
                }

                if (q4byes) {
                    yes4b = yesq4b.getText().toString().trim();
                } else {
                    yes4b = "No";
                }
                if (q4cyes) {
                    yes4c = yesq4c.getText().toString().trim();
                } else {
                    yes4c = "No";
                }

                combinedIntent.putExtra("yes1", yes1);
                combinedIntent.putExtra("yes2", yes2);
                combinedIntent.putExtra("yes3", yes3);
                combinedIntent.putExtra("yes4a", yes4a);
                combinedIntent.putExtra("yes4b", yes4b);
                combinedIntent.putExtra("yes4c", yes4c);

                //Photo processing.
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                picfrom2.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                combinedIntent.putExtra("bitmap", byteArray);

                //Notifications.
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),
                        0, combinedIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                NotificationManager notifManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                displayToast("Criminal background successfully submitted!\nDirecting you to the next page...");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    NotificationChannel notificationChannel = notifManager.getNotificationChannel(channelID);
                    if (notificationChannel == null) {
                        int importance = NotificationManager.IMPORTANCE_HIGH;
                        notificationChannel = new NotificationChannel(channelID, "Some description", importance);
                        notificationChannel.setLightColor(Color.RED);
                        notificationChannel.enableVibration(true);
                        notifManager.createNotificationChannel(notificationChannel);
                    }
                }
                notifManager.notify(0, builder.build());
            }


        });

        return3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(criminalBackground_3RD.this, educationalBackground_2ND.class);
                startActivity(i);
            }
        });
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


}
