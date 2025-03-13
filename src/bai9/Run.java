package bai9;

public class Run {
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyễn Văn A", "E001", 5000);
        Manager mgr = new Manager("Trần Thị B", "M001", 8000, 2000);
        Developer dev = new Developer("Lê Văn C", "D001", 7000, "Java");

        System.out.println("Thông tin nhân viên:");
        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(dev);
        System.out.println("----------------------");

        emp.increaseSalary(1000);
        System.out.println("Thông tin sau khi tăng lương:");
        System.out.println(emp);
    }
}

