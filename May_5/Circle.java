package act4.ClassPack;

public class Circle {

    private float radius;

    public float getRadius() {
        return radius;
    }

    public float setRadius(float radius) {
        return this.radius = radius;
    }

    public void resultsCircle(){
        double area = Math.PI * Math.pow(this.radius, 2.0);
        double circumference = Math.PI * (this.radius);

        System.out.println("Radius is: " + area);
        System.out.println("Circumference is: " + circumference);
    }

}
