package machineProblem1;

public class box extends rectangle {
    private double height;
    
    box(double height, double width, double length) {
        super(length, width);
        this.height = height;
    }

    public double boxResult() {
        return rectangleResult()*height;
    }

}
