package Inheritance;

class circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {

        circle c = new circle();
        c.setRadius(5);
        System.out.println("Area: "+ c.getArea());

        c.setRadius(-2);
        System.out.println("Area: " + c.getArea());
    }
}
