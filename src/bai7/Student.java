package bai7;

import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner scanner = new Scanner(System.in);
        while (name == null || name.trim().isEmpty()) {
            System.out.println("Tên sinh viên không được để trống. Vui lòng nhập lại:");
            name = scanner.nextLine();
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        Scanner scanner = new Scanner(System.in);
        while (id == null || id.trim().isEmpty()) {
            System.out.println("Mã sinh viên không được để trống. Vui lòng nhập lại:");
            id = scanner.nextLine();
        }
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        Scanner scanner = new Scanner(System.in);
        while (gpa < 0.0 || gpa > 4.0) {
            System.out.println("GPA phải nằm trong khoảng 0.0 - 4.0. Vui lòng nhập lại:");
            gpa = scanner.nextDouble();
        }
        this.gpa = gpa;
    }

    public String getDetails() {
        return "Tên: " + name + ", Mã SV: " + id + ", GPA: " + gpa;
    }
}
