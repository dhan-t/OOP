package com.example.finalsoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class reportResults_4TH extends AppCompatActivity {
    Bitmap img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_results);

        //Instantiation of variables from xml file.
        TextView fullName = findViewById(R.id.txtvFullName);
        TextView emailTextView = findViewById(R.id.txtvEmail);
        TextView contactNumTextView = findViewById(R.id.txtvContactNum);
        TextView heightTextView = findViewById(R.id.txtvHeight);
        TextView weightTextView = findViewById(R.id.txtvWeight);
        TextView genderTextView = findViewById(R.id.txtvGender4t);
        TextView civilStatusTextView = findViewById(R.id.txtvCivilStatus4th);
        TextView pagIbigIdTextView = findViewById(R.id.txtvPagIbigID4th);
        TextView philhealthIdTextView = findViewById(R.id.txtvPhilhealthID4th2);
        TextView tinIdTextView = findViewById(R.id.txtvTINID4th3);
        TextView gsisIdTextView = findViewById(R.id.txtvGSISID4th2);
        TextView emergencyNameTextView = findViewById(R.id.txtvEmergencyName);
        TextView emergencyContactTextView = findViewById(R.id.txtvEmergencyContact);
        TextView relationshipTextView = findViewById(R.id.txtvRelationship);
        TextView elemNameTextView = findViewById(R.id.txtvElemName4th);
        TextView elemCourseTextView = findViewById(R.id.txtvElemCourse4th);
        TextView secondaryNameTextView = findViewById(R.id.txtvSecondaryName4th);
        TextView secondaryCourseTextView = findViewById(R.id.txtvSecondaryName4th2);
        TextView vocationalNameTextView = findViewById(R.id.txtvVocationalName4th);
        TextView vocationalCourseTextView = findViewById(R.id.txtvVocationalCourse4th);
        TextView collegeNameTextView = findViewById(R.id.txtvCollegeName4th3);
        TextView collegeCourseTextView = findViewById(R.id.txtvCollegeCourse4th);
        TextView gradStudNameTextView = findViewById(R.id.txtvGradStudName4th);
        TextView gradStudCourseTextView = findViewById(R.id.txtvGradstudCourse4th);
        TextView crimYes1TextView = findViewById(R.id.txtvCrimYes1);
        TextView crimYes2TextView = findViewById(R.id.txtvCrimYes2);
        TextView crimYes3TextView = findViewById(R.id.txtvCrimYes3);
        TextView crimYes4TextView = findViewById(R.id.txtvCrimYes4);
        TextView crimYes4bTextView = findViewById(R.id.txtvCrimYes4b);
        TextView crimYes4cTextView = findViewById(R.id.txtvCrimYes4c);
        ImageView imageViewP = findViewById(R.id.imageView);
        Button returnHome = findViewById(R.id.btnReturnHome);

        //To get values from all other pages.
        Intent combinedIntent = getIntent();
        String firstname = combinedIntent.getStringExtra("firstname");
        String lastname = combinedIntent.getStringExtra("lastname");
        String midname = combinedIntent.getStringExtra("midname");
        String email = combinedIntent.getStringExtra("email");
        String height = combinedIntent.getStringExtra("height");
        String weight = combinedIntent.getStringExtra("weight");
        String gender = combinedIntent.getStringExtra("gender");
        String civil = combinedIntent.getStringExtra("civil");
        String Pagibig = combinedIntent.getStringExtra("Pagibig");
        String Philhealth = combinedIntent.getStringExtra("Philhealth");
        String GSIS = combinedIntent.getStringExtra("GSIS");
        String TIN = combinedIntent.getStringExtra("TIN");
        String ename = combinedIntent.getStringExtra("ename");
        String enumb = combinedIntent.getStringExtra("enumb");
        String phonnum = combinedIntent.getStringExtra("phonnum");
        String selectedRes = combinedIntent.getStringExtra("selectedERes");
        String Elem = combinedIntent.getStringExtra("Elem");
        String ElemEduc = combinedIntent.getStringExtra("ElemEduc");
        String Secondary = combinedIntent.getStringExtra("Secondary");
        String SecondaryEduc = combinedIntent.getStringExtra("SecondaryEduc");
        String Vocationname = combinedIntent.getStringExtra("Vocationname");
        String VocationCourse = combinedIntent.getStringExtra("VocationCourse");
        String College = combinedIntent.getStringExtra("College");
        String CollegeCourse = combinedIntent.getStringExtra("CollegeCourse");
        String GradStudy = combinedIntent.getStringExtra("GradStudy");
        String GradStudyCourse = combinedIntent.getStringExtra("GradStudyCourse");
        String yes1 = combinedIntent.getStringExtra("yes1");
        String yes2 = combinedIntent.getStringExtra("yes2");
        String yes3 = combinedIntent.getStringExtra("yes3");
        String yes4a = combinedIntent.getStringExtra("yes4a");
        String yes4b = combinedIntent.getStringExtra("yes4b");
        String yes4c = combinedIntent.getStringExtra("yes4c");

        //For photo grabbing.
        byte[] frompage2 = combinedIntent.getByteArrayExtra("bitmap");
        Bitmap photofrom3 = BitmapFactory.decodeByteArray(frompage2, 0, frompage2.length);
        imageViewP.setImageBitmap(photofrom3);

        String fullname = firstname + " " + midname + " " + lastname;

        //Filling up with user input.
        fullName.setText("Full name: \n" + fullname);
        emailTextView.setText("Email: \n" + email);
        contactNumTextView.setText("Phone Number: \n" + phonnum);
        heightTextView.setText("Height: " + height);
        weightTextView.setText("Weight: " + weight);
        genderTextView.setText("Gender: " + gender);
        civilStatusTextView.setText("Civil Status: " + civil);
        pagIbigIdTextView.setText("Pagibig ID: " + Pagibig);
        philhealthIdTextView.setText("Philhealth ID: " + Philhealth);
        tinIdTextView.setText("TIN ID: " + TIN);
        gsisIdTextView.setText("GSIS ID: " + GSIS);
        emergencyNameTextView.setText("Emergency contact person: \n" + ename);
        emergencyContactTextView.setText("Emergency Number: \n" + enumb);
        relationshipTextView.setText("Relationship with person: " + selectedRes);
        elemNameTextView.setText("Elementary name: \n" + Elem);
        elemCourseTextView.setText("Education: \n" + ElemEduc);
        secondaryNameTextView.setText("Secondary school name: \n" + Secondary);
        secondaryCourseTextView.setText("Education: \n" + SecondaryEduc);
        vocationalNameTextView.setText("Vocational school name: \n" + Vocationname);
        vocationalCourseTextView.setText("Education: \n" + VocationCourse);
        collegeNameTextView.setText("College name: \n" + College);
        collegeCourseTextView.setText("Degree: \n" + CollegeCourse);
        gradStudNameTextView.setText("Graduate school name: \n" + GradStudy);
        gradStudCourseTextView.setText("Degree: \n" + GradStudyCourse);
        crimYes1TextView.setText(": " + yes1);
        crimYes2TextView.setText(": " + yes2);
        crimYes3TextView.setText(": " + yes3);
        crimYes4TextView.setText(": " + yes4a);
        crimYes4bTextView.setText(": " + yes4b);
        crimYes4cTextView.setText(": " + yes4c);

        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(reportResults_4TH.this, personalBackground_HP.class);
                startActivity(i);
            }
        });
    }



    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
