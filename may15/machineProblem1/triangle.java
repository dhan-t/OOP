public class triangle extends Shape {
    public triangle(double height, double width) {
        super(height, width);
    }

    public double tirangleResult() {
        return getHeight() * getWidth() / 2;
    }

}
