package machineProblem1;

public class rectangle extends App {
    private double length;
    private double width;
    
    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double rectangleResult() {
        return length * width;
    }

}
