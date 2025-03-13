package bai3;

import java.time.Year;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if (year > 1885 && year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Năm sản xuất không hợp lệ! Hãy nhập một năm từ 1886 đến " + currentYear);
        }
    }
    public void displayCarInfo() {
        System.out.println("Thương hiệu: " + make);
        System.out.println("Mẫu xe: " + model);
        System.out.println("Năm sản xuất: " + year);
    }
}
