package bai5;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius); // Gọi constructor của lớp cha
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chiều cao phải lớn hơn 0.");
        }
    }
    public double getVolume() {
        return getArea() * height;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Chiều cao: " + height);
        System.out.println("Thể tích: " + getVolume());
    }
}
