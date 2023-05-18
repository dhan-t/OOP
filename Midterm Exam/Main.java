package classPack;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose: \n 1.) Circle \n 2.) Rectangle \n 3.) Square \n 4.) Triangle");
        System.out.print("Chosen Number: ");
        switch (sc.nextInt()) {
            case 1:
                // Circle
                System.out.print("\nEnter radius: ");
                double radius = sc.nextDouble();

                circle bilog = new circle(radius, radius);
                double radiusC = bilog.getArea();

                System.out.println("\nThe area of circle is: " + radiusC);
                System.out.println("No computation for volume as circle could be a sphere, cylinder, or a cone.\n");

                break;

            case 2:
                // Rectangle
                System.out.print("\nEnter width: ");
                double widthR = sc.nextDouble();

                System.out.print("Enter length: ");
                double lengthR = sc.nextDouble();

                System.out.print("Eneter height: ");
                double heightR = sc.nextDouble();

                rectangle parihaba = new rectangle(widthR, lengthR, heightR);
                double areaR = parihaba.getArea();
                double volumeR = parihaba.getVolume();

                System.out.println("\nArea of rectangle: " + areaR);
                System.out.println("Volume of rectangle: " + volumeR + "\n");

                break;

            case 3:
                // Square
                System.out.print("\nEnter length: ");
                double lengthS = sc.nextDouble();

                square parisukat = new square(lengthS, lengthS);
                double areaS = parisukat.getArea();
                double volumeS = parisukat.getVolume();

                System.out.println("\n The are of square is: " + areaS);
                System.out.println("The volume of square is: " + volumeS + "\n");

                break;

            case 4:
                // Triangle
                System.out.print("\nEnter base: ");
                double baseT = sc.nextDouble();

                System.out.print("Enter height: ");
                double heightT = sc.nextDouble();

                triangle tatsulok = new triangle(baseT, heightT);
                double areaT = tatsulok.getArea();
                double volumeT = tatsulok.getVolume();

                System.out.println("\nThe area of triangle is: " + areaT);
                System.out.println("The volume of triangle is: " + volumeT + "\n");

                break;

            default:
                System.out.println("Error! Unable to find number.");
                break;

        }
    }
}
