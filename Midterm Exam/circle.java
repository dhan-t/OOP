package classPack;

import java.lang.Math;

public class circle extends Shape {

    circle(double param1, double param2) {
        super(param1, param2);
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.sqrt(getParam1()));
    }

}

