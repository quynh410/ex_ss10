package bai5;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Thông tin hình tròn:");
        circle.displayInfo();

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("\nThông tin hình trụ:");
        cylinder.displayInfo();

        circle.setRadius(7);
        System.out.println("\nSau khi thay đổi bán kính hình tròn:");
        circle.displayInfo();

        cylinder.setRadius(7);
        cylinder.setHeight(15);
        System.out.println("\nSau khi thay đổi bán kính và chiều cao hình trụ:");
        cylinder.displayInfo();
    }
}
