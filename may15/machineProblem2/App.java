package machineProblem1;

import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Enter length");
        double length = sc.nextDouble();

        box parisukat = new box(height, width, length);
        System.out.println("Rectangle area = " + parisukat.rectangleResult());
        System.out.println("Box volume = " + parisukat.boxResult());
        


    }
}
