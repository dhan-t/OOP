public class rectangle extends Shape {

    rectangle(double height, double width) {
        super(height, width);
    }

    public double rectangleResult() {
        return super.getHeight() * super.getWidth();
    }

}
