package act4;
import java.util.*;

import act4.ClassPack.Animal;
import act4.ClassPack.Circle;
import act4.ClassPack.Employee;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       

        System.out.println("\nNumber 1");

        Tao person = new Tao();
        System.out.print("Enter name: ");
        person.pangalan = sc.next();
        System.out.print("Enter age: ");
        person.edad = sc.nextInt();
        person.showInfo();


        System.out.println("\nNumber 2");

        Animal hayop = new Animal();
        System.out.print("Enter name of animal: ");
        String name = sc.next();
        hayop.setName(name);

        System.out.print("Enter breed of animal: ");
        String breed = sc.next();
        hayop.setBreed(breed);
        
        System.out.println("Animal name is: "+ hayop.getName() + ", and it is a: " + hayop.getBreed() + ".");


        System.out.println("\nNumber 3");

        Employee empliyado = new Employee();
        System.out.println("Enter name: ");
        String name3 = sc.next();
        empliyado.setName(name3);

        System.out.println("Enter Job Title: ");
        String job = sc.next();
        empliyado.setJobTitle(job);

        System.out.println("Enter Salary: ");
        int salary = sc.nextInt();
        empliyado.setSalary(salary);

        System.out.println("Enter number of days attended: ");
        int days = sc.nextInt();
        empliyado.setAttendance(days);
        empliyado.printer();
        
        System.out.println("\nNumber 4");

        Circle bilog = new Circle();
        System.out.println("Enter radius: ");
        float radius = sc.nextFloat();
        bilog.setRadius(radius);
        bilog.resultsCircle();





    }
}
