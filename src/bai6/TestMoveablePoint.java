package bai6;
public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println("Điểm ban đầu: " + point);

        MoveablePoint moveablePoint = new MoveablePoint(3, 4, 2, 3);
        System.out.println("Điểm có thể di chuyển ban đầu: " + moveablePoint);

        moveablePoint.move();
        System.out.println("Sau khi di chuyển: " + moveablePoint);

        moveablePoint.setXSpeed(5);
        moveablePoint.setYSpeed(2);
        moveablePoint.move();
        System.out.println("Sau khi thay đổi tốc độ và di chuyển tiếp: " + moveablePoint);
    }
}
