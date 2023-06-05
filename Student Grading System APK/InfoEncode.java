    package com.example.june5_oop;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    import java.util.ArrayList;
    import java.util.List;

    public class InfoEncode extends AppCompatActivity{

        private List<EditText> fieldChecker;

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

            fieldChecker = new ArrayList<>();
            fieldChecker.add(lname);
            fieldChecker.add(fname);
            fieldChecker.add(mname);

            fieldChecker.add(brtYR);
            fieldChecker.add(cnctN);

            fieldChecker.add(bsba);
            fieldChecker.add(course);
            fieldChecker.add(yrLVL);

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
                    displayToast("Information Submitted!");

                    SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("lname", lname.getText().toString().trim());
                    editor.putString("fname", fname.getText().toString().trim());
                    editor.putString("mname", mname.getText().toString().trim());

                    String contactString = cnctN.getText().toString().trim();
                    int contact = Integer.parseInt(contactString);
                    editor.putInt("contact", contact);

                    String bdayString = brtYR.getText().toString().trim();
                    int bday = Integer.parseInt(bdayString);
                    editor.putInt("bday", bday);
                    editor.putString("BS/BA", bsba.getText().toString().trim());
                    editor.putString("course", course.getText().toString().trim());
                    editor.putString("yrlvl", yrLVL.getText().toString().trim());

                    String yearLevel = yrLVL.getText().toString().trim();

                    int yrLVL2 = Integer.parseInt(yearLevel);

                    editor.putInt("year level", yrLVL2);

                    editor.apply();

                    UserSession.loggedIn = true;

                    Intent i = new Intent(InfoEncode.this, InfoView.class);
                    startActivity(i);
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
