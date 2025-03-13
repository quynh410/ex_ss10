package bai9;

public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee() {
        this.name = "Unknown";
        this.id = "000";
        this.salary = 0.0;
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Lương đã được tăng thêm " + amount);
        } else {
            System.out.println("Số tiền tăng lương không hợp lệ.");
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Mã nhân viên: " + id + ", Lương: " + salary;
    }
}

