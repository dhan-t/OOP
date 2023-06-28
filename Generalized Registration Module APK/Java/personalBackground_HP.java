package com.example.finalsoop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.Manifest;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.*;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class personalBackground_HP extends AppCompatActivity {
    public static final int CAMERA_REQUEST_CODE = 102;
    public static final int REQUEST_CODE = 101;
    private ImageView photoID;
    private String selectedERes = "";
    private Bitmap squareBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_background_main);

        //Instantiate the xml variables.
        photoID = findViewById(R.id.imgvPicture);
        EditText fname = findViewById(R.id.edtxtFNamepbg);
        EditText lname = findViewById(R.id.edtxtLNamepbg);
        EditText mname = findViewById(R.id.edtxtMNamepbg);
        EditText email = findViewById(R.id.edtxtEmailpbg);
        EditText phoneNUM = findViewById(R.id.edtxtPhnNUm);
        EditText height = findViewById(R.id.etxtHeight);
        EditText weight = findViewById(R.id.etxtWeight);
        EditText pagibigID = findViewById(R.id.edtxtPagibig);
        EditText philhealthID = findViewById(R.id.edtxtPhilhealth);
        EditText gsisID = findViewById(R.id.edtxtGSIS);
        EditText tinID = findViewById(R.id.edtxtTIN);
        EditText eName = findViewById(R.id.edtxtNameEC);
        EditText eNum = findViewById(R.id.edtxtContactEC);


        //Emergency contact relationship.
        Spinner spinner = findViewById(R.id.spnrRelationship);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedERes = parent.getItemAtPosition(position).toString();
                // Use the selectedERes value or trigger actions that rely on it
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedERes = "Others";
            }
        });

        Button submit = findViewById(R.id.btnSubmitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Personal Info
                String lastname = lname.getText().toString().trim();
                String firstname = fname.getText().toString().trim();
                String midname = mname.getText().toString().trim();
                String phonenumber = phoneNUM.getText().toString().trim();
                String Weight = weight.getText().toString().trim();
                String Height = height.getText().toString().trim();
                String email2 = email.getText().toString().trim();

                //Civil Status
                RadioGroup civilgroup = findViewById(R.id.rbtnGCivilStatus);
                int selectedCivil = civilgroup.getCheckedRadioButtonId();
                RadioButton selectedcivil1 = findViewById(selectedCivil);
                String civilSelected = selectedcivil1.getText().toString();

                //Gender
                RadioGroup gendergroup = findViewById(R.id.rbtnGGender);
                int selectedgender = gendergroup.getCheckedRadioButtonId();
                RadioButton selectedGender1 = findViewById(selectedgender);
                String genderSelected = selectedGender1.getText().toString();

                //IDs
                String pagibig = pagibigID.getText().toString().trim();
                String philhealth = philhealthID.getText().toString().trim();
                String gsis = gsisID.getText().toString().trim();
                String tin = tinID.getText().toString().trim();

                //Emergency contact.
                String ename = eName.getText().toString().trim();
                String enumb = eNum.getText().toString().trim();

                //Checks if items are empty.
                if (lastname.isEmpty() || firstname.isEmpty() || midname.isEmpty() || email2.isEmpty() || phonenumber.isEmpty() || ename.isEmpty() || enumb.isEmpty()) {
                    displayToast("Please input all fields!");
                } else {
                    displayToast("Personal information successfully submitted!\nDirecting you to the next page...");

                    Intent personalInfo = new Intent(personalBackground_HP.this, educationalBackground_2ND.class);
                    personalInfo.putExtra("firstname", firstname);
                    personalInfo.putExtra("lastname", lastname);
                    personalInfo.putExtra("midname", midname);
                    personalInfo.putExtra("email", email2);
                    personalInfo.putExtra("height", Height);
                    personalInfo.putExtra("weight", Weight);
                    personalInfo.putExtra("Pagibig", pagibig);
                    personalInfo.putExtra("Philhealth", philhealth);
                    personalInfo.putExtra("GSIS", gsis);
                    personalInfo.putExtra("TIN", tin);
                    personalInfo.putExtra("gender", genderSelected);
                    personalInfo.putExtra("civil", civilSelected);
                    personalInfo.putExtra("ename", ename);
                    personalInfo.putExtra("enumb", enumb);
                    personalInfo.putExtra("phonnum", phonenumber);
                    personalInfo.putExtra("selectedERes", selectedERes);

                    //Picture conversion and sending.
                    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                    squareBitmap.compress(Bitmap.CompressFormat.PNG, 100, bytes);
                    byte[] photoByteArray = bytes.toByteArray();
                    personalInfo.putExtra("photoArray", photoByteArray);

                    startActivity(personalInfo);
                }
            }
        });

        Button camera = findViewById(R.id.btnCamera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });

        ArrayList<String> rsArray = new ArrayList<>();
        rsArray.add("Relationship");
        rsArray.add("Mother");
        rsArray.add("Father");
        rsArray.add("Brother");
        rsArray.add("Sister");
        rsArray.add("Wife");
        rsArray.add("Husband");
        rsArray.add("Others");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, rsArray);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

    private boolean camPermission() {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED;
    }

    private void reqCamPerm() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, REQUEST_CODE);
    }

    private void openCamera() {
        Intent camIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camIntent, CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            photoID = findViewById(R.id.imgvPicture);
            assert data != null;
            Bitmap originalBitmap = (Bitmap) data.getExtras().get("data");

            // Rotate the originalBitmap if needed
            Bitmap rotatedBitmap = rotateBitmap(originalBitmap, 270); // Rotate by 90 degrees clockwise

            // Crop the rotatedBitmap to make it square
            squareBitmap = cropToSquare(rotatedBitmap);

            photoID.setImageBitmap(squareBitmap);

            // Convert the formatted squareBitmap to a byte array
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            squareBitmap.compress(Bitmap.CompressFormat.PNG, 100, bytes);
            byte[] photoByteArray = bytes.toByteArray();

        }
    }

    private Bitmap rotateBitmap(Bitmap bitmap, float degrees) {
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    // Crop the bitmap to make it square
    private Bitmap cropToSquare(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int size = Math.min(width, height);
        int x = (width - size) / 2;
        int y = (height - size) / 2;
        return Bitmap.createBitmap(bitmap, x, y, size, size);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCamera();
            } else {
                Toast.makeText(personalBackground_HP.this, "Camera permission denied, please allow permission to take picture.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
