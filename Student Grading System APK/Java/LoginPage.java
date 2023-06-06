package com.example.june5_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    boolean loginSuccess = false;
    final String username = "admin";
    final String password = "admin123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        Switch swtchShowPass = findViewById(R.id.swtchShowPass);
        final EditText pwtxtPword = findViewById(R.id.pwtxtPword);
        swtchShowPass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    pwtxtPword.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    pwtxtPword.setInputType(android.text.InputType.TYPE_CLASS_TEXT | android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ptxtUname = findViewById(R.id.ptxtUname);
                EditText pwtxtPword = findViewById(R.id.pwtxtPword);

                String usernameScan = ptxtUname.getText().toString();
                String passwordScan = pwtxtPword.getText().toString();

                do{
                    if (!usernameScan.equals(username) && !passwordScan.equals(password)) {
                        displayToast("Unknown User");
                    } else if (!usernameScan.equals(username)) {
                        displayToast("Incorrect Username");
                    } else if (!passwordScan.equals(password)) {
                        displayToast("Incorrect Password");
                    } else if (usernameScan.equals(username) && passwordScan.equals(password)) {
                        displayToast("Login successful");
                        Intent i2 = new Intent(LoginPage.this, Menu.class);
                        i2.putExtra("loginSuccess", loginSuccess);
                        startActivity(i2);

                        Intent i = new Intent(LoginPage.this, Menu.class);
                        startActivity(i);

                    }
                }while(loginSuccess = false);
            }
        });
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
