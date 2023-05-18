package classPack;

import java.lang.Math;

public class square extends Shape {

    square(double param1, double param2) {
        super(param1, param2);
    }

    @Override
    public double getArea() {
        return Math.pow(getParam1(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getParam1(), 3);
    }

}

