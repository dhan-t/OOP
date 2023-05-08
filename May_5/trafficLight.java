package act4.ClassPack;

public class trafficLight {

    protected String color;
    protected int duration;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void trafficControl() {
        System.out.println("Traffic light status: \n");

        color.toLowerCase();
        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("green")) {
            System.out.println("Go!");
        } else if (color.equals("yellow")) {
            System.out.println("Slow down");
        } else {
            System.out.println("Unknown color");
        }

        System.out.println("Your new duration is: " + this.duration);
    }

}
