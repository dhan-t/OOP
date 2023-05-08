package act4;
import java.util.*;

import act4.ClassPack.Animal;
import act4.ClassPack.Circle;
import act4.ClassPack.Employee;
import act4.ClassPack.trafficLight;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
  

/////////////////////////////////////////////////////////////       
        System.out.println("\nNumber 1");

        Tao person = new Tao();
        System.out.print("Enter name: ");
        person.pangalan = sc.next();
        System.out.print("Enter age: ");
        person.edad = sc.nextInt();
        person.showInfo();


/////////////////////////////////////////////////////////////
        System.out.println("\nNumber 2");

        Animal hayop = new Animal();
        System.out.print("Enter name of animal: ");
        hayop.setName(sc.next());

        System.out.print("Enter breed of animal: ");
        hayop.setBreed(sc.next());
        System.out.println("Animal name is: "+ hayop.getName() + ", and it is a: " + hayop.getBreed() + ".");

/////////////////////////////////////////////////////////////
        System.out.println("\nNumber 3");

        Employee empliyado = new Employee();
        System.out.println("Enter name: ");
        empliyado.setName(sc.next());

        System.out.println("Enter Job Title: ");
        empliyado.setJobTitle(sc.next());

        System.out.println("Enter Salary: ");
        empliyado.setSalary(sc.nextInt());

        System.out.println("Enter number of days attended: ");
        empliyado.setAttendance(sc.nextInt());
        empliyado.printer();

/////////////////////////////////////////////////////////////
        System.out.println("\nNumber 4");

        Circle bilog = new Circle();
        System.out.println("Enter radius: ");
        bilog.setRadius(sc.nextFloat());
        bilog.resultsCircle();

/////////////////////////////////////////////////////////////
        System.out.println("Number 5");
        trafficLight trapik = new trafficLight();
        System.out.println("Enter new color: ");
        trapik.setColor(sc.next());

        System.out.println("Enter new duration: ");
        trapik.setDuration(sc.nextInt());
        
        trapik.trafficControl();

    }
}

