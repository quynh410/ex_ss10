package bai3;
public class RunCar {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);

        System.out.println("Thông tin xe ban đầu:");
        myCar.displayCarInfo();

        myCar.setMake("KAWASAKIIII");
        myCar.setModel("YAMAHAHAHAH");
        myCar.setYear(2023);
        myCar.setYear(2050);

        System.out.println("\nThông tin xe sau khi cập nhật:");
        myCar.displayCarInfo();
    }
}
