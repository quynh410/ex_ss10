package bai5;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính phải lớn hơn 0.");
        }
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void displayInfo() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Diện tích: " + getArea());
    }
}
