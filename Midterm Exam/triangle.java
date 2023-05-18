package classPack;

public class triangle extends Shape {

    triangle(double param1, double param2) {
        super(param1, param2);
    }

    @Override
    public double getArea() {
        return 0.5 * getParam1() * getParam2();
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

}

