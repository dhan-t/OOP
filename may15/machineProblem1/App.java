import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Choose: \n 1.) Rectangle \n 2.) Triangle12");
        switch (sc.nextInt()) {
            case 1:
                rectangle parihaba = new rectangle(height, width);
                double area = parihaba.rectangleResult();
                System.out.println("Area of rectanlge = " + area);
                break;
            case 2:
                triangle tatsulok = new triangle(height, width);
                double area2 = tatsulok.tirangleResult();
                System.out.println("Area of triangle = " + area2);
                break;
            default:
                System.out.println("Error! Unable to find number.");
                break;

        }
    }
}
