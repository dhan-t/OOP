package classPack;

public class rectangle extends Shape {

    private double height;

    public rectangle(double param1, double param2, double height) {
        super(param1, param2);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getParam1() * super.getParam2();

    }

    @Override
    public double getVolume() {
        return super.getParam1() * super.getParam2() * height;
    }

}


