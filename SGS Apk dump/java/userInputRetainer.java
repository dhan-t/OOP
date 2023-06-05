package com.example.june5_oop.ui;
import android.content.Context;
import android.content.SharedPreferences;

public class userInputRetainer {
    private static userInputRetainer instance;
    public Object contactNum;
    private String LNameUIR;
    private String FNameUIR;
    private String MNameUIR;
    private int birthYearUIR;
    private String contactNumUIR;

    private String BSBAUIR;
    private String CourseUIR;
    private int yrLvlUIR;

    private int attendanceUIR;
    private int examsUIR;
    private int quiz1UIR;
    private int quiz2UIR;
    private int quiz3UIR;
    private int quiz4UIR;

    public void fullNameCons(String FNameUIR, String MNameUIR, String LNameUIR) {
        this.FNameUIR = FNameUIR;
        this.MNameUIR = MNameUIR;
        this.LNameUIR = LNameUIR;
    }

    public void fullCourseCons(String BSBAUIR, String CourseUIR, int yrLvlUIR) {
        this.BSBAUIR = BSBAUIR;
        this.CourseUIR = CourseUIR;
        this.yrLvlUIR = yrLvlUIR;
    }

    public void averageCalcCons(int attendanceUIR, int examsUIR, int quiz1UIR, int quiz2UIR, int quiz3UIR, int quiz4UIR) {
        this.attendanceUIR = attendanceUIR;
        this.examsUIR = examsUIR;
        this.quiz1UIR = quiz1UIR;
        this.quiz2UIR = quiz2UIR;
        this.quiz3UIR = quiz3UIR;
        this.quiz4UIR = quiz4UIR;
    }

    public static userInputRetainer getInstance() {
        if (instance == null) {
            instance = new userInputRetainer();
        }
        return instance;
    }


    private static final String PREF_NAME = "MyPreferences";

    // Method to save the calculated result
    public static void saveResult(Context context, int result) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt("result", result);
        editor.apply();
    }

    // Method to retrieve the calculated result
    public static int getResult(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt("result", 0); // 0 is the default value if result is not found
    }

    public String getContactNum() {
        return (String) contactNum;
    }

    public int ageCalcUIR() {
        return 2023 - birthYearUIR;
    }

    public String fullNameUIR() {
        String fullName = (this.FNameUIR + " " + this.MNameUIR + " " + this.LNameUIR);
        return fullName;
    }

    public String fullCourseUIR() {
        String fullCourse = (this.BSBAUIR + " " + this.CourseUIR);
        return fullCourse;
    }

    public String birthYear() {
        String birthYear = (birthYearUIR + "y/o");
        return birthYear;
    }
    public String getYrLvl() {
        String yearLVL = ("Year" + yrLvlUIR);
        return yearLVL;
    }

    public String LNameOnly() {
        this.LNameUIR = LNameUIR;
        return LNameUIR;
    }

    public String FNameOnly() {
        this.FNameUIR = FNameUIR;
        return FNameUIR;
    }

    public String MNameOnly() {
        this.MNameUIR = MNameUIR;
        return MNameUIR;
    }

    public int aveCompute(){
        int quizAverage = (this.quiz1UIR + this.quiz2UIR + this.quiz3UIR + this.quiz4UIR) / 4;
        double average = (attendanceUIR * 0.2) + (quizAverage * 0.3) + (examsUIR * 0.5);
        return (int) average;
    }

    public String remarks(){
        String remarks;
        int average = aveCompute();

        if (average >= 96 && average <= 100) {
            remarks = "4.00";
        } else if (average >= 90 && average <= 95) {
            remarks = "3.50";
        } else if (average >= 84 && average <= 89) {
            remarks = "3.00";
        } else if (average >= 78 && average <= 83) {
            remarks = "2.50";
        } else if (average >= 72 && average <= 77) {
            remarks = "2.00";
        } else if (average >= 66 && average <= 71) {
            remarks = "1.50";
        } else if (average >= 60 && average <= 65) {
            remarks = "1.00";
        } else {
            remarks = "INC";
        }

        return remarks;
    }

    public String passOrFail(){
        String passorfail;
        int average = aveCompute();

        if (average >= 60){
            passorfail = "Passed";
        }else {
            passorfail = "Fail";
        }

        return passorfail;
    }

    public int attendanceOnly(){
        this.attendanceUIR = attendanceUIR;
        return  attendanceUIR;
    }
    public int examOnly(){
        this.examsUIR = examsUIR;
        return  examsUIR;
    }
    public int qz1Only(){
        this.quiz1UIR = quiz1UIR;
        return  quiz1UIR;
    }
    public int qz2Only(){
        this.quiz2UIR = quiz2UIR;
        return  quiz2UIR;
    }
    public int qz3Only(){
        this.quiz3UIR = quiz3UIR;
        return  quiz3UIR;
    }
    public int qz4Only(){
        this.quiz4UIR = quiz4UIR;
        return  quiz4UIR;
    }


}


