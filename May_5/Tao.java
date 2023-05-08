package act4;

import java.util.*;

public class Tao {
    public static Scanner sc = new Scanner(System.in);

    String pangalan;
    int edad;

    public String getName() {
        return pangalan;
    }

    public void setName(String pangalan) {
        this.pangalan = pangalan;
    }

    public int getAge() {
        return edad;
    }

    public void setAge(int edad) {
        this.edad = edad;
    }

    void showInfo() {
        System.out.println("Your name is: " + this.pangalan + " and you are " + this.edad + " years old.");
    }
}
