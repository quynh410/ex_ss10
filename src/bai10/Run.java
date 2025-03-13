package bai10;

public class Run {
    public static void main(String[] args) {
        Shape circle = new Circle("Hình Tròn", 5);
        Shape rectangle = new Rectangle("Hình Chữ Nhật", 4, 6);
        Shape triangle = new Triangle("Hình Tam Giác", 3, 4, 5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
