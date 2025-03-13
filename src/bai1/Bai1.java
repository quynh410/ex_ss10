package bai1;

public class Bai1 {
    /*
        1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?
Tính đóng gói (Encapsulation) là một trong bốn nguyên tắc quan trọng của lập trình hướng đối tượng (OOP). Nó giúp bảo vệ dữ liệu bằng cách giới hạn quyền truy cập vào các thành phần bên trong của một đối tượng và chỉ cho phép truy cập thông qua các phương thức cụ thể.

Lý do tính đóng gói quan trọng:

Bảo vệ dữ liệu: Ngăn chặn việc truy cập và thay đổi dữ liệu trực tiếp từ bên ngoài.
Kiểm soát truy cập: Chỉ cho phép các thao tác hợp lệ thông qua các phương thức được định nghĩa trước (getter và setter).
Dễ bảo trì: Dễ dàng thay đổi nội dung bên trong lớp mà không ảnh hưởng đến các phần khác của chương trình.
Tăng tính tái sử dụng: Lớp có thể được sử dụng lại mà không cần quan tâm đến cách dữ liệu được xử lý bên trong.
2. Làm thế nào để áp dụng tính đóng gói trong Java? Giải thích cách sử dụng các phương thức getter và setter.
Trong Java, tính đóng gói được thực hiện bằng cách:

Khai báo các thuộc tính của lớp ở mức truy cập private, ngăn không cho các lớp khác truy cập trực tiếp.
Cung cấp các phương thức getter và setter với mức truy cập public để truy xuất hoặc cập nhật giá trị thuộc tính một cách an toàn.
Getter là phương thức dùng để lấy giá trị của thuộc tính.
Setter là phương thức dùng để thay đổi giá trị của thuộc tính, có thể kèm theo các điều kiện kiểm tra hợp lệ.
3. Ví dụ về tính đóng gói trong Java
Dưới đây là một ví dụ về lớp Person sử dụng tính đóng gói:

java
Sao chép mã
// Lớp Person sử dụng tính đóng gói
public class Person {
    // Thuộc tính private (chỉ có thể truy cập trong lớp này)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho age
    public int getAge() {
        return age;
    }

    // Setter cho age (kiểm tra tuổi hợp lệ)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi phải lớn hơn 0!");
        }
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}

// Lớp Main để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Person
        Person person = new Person("Alice", 25);

        // Hiển thị thông tin ban đầu
        person.displayInfo();

        // Cập nhật giá trị thông qua setter
        person.setName("Bob");
        person.setAge(30);

        // Hiển thị thông tin sau khi cập nhật
        person.displayInfo();

        // Thử đặt tuổi không hợp lệ
        person.setAge(-5);
    }
}
Kết quả đầu ra:

less
Sao chép mã
Tên: Alice, Tuổi: 25
Tên: Bob, Tuổi: 30
Tuổi phải lớn hơn 0!
4. Lợi ích của tính đóng gói trong việc bảo vệ dữ liệu và kiểm soát quyền truy cập
Ngăn chặn truy cập trái phép: Các thuộc tính private không thể bị thay đổi trực tiếp từ bên ngoài.
Dễ dàng kiểm soát dữ liệu: Dữ liệu chỉ có thể thay đổi thông qua các phương thức setter, giúp kiểm soát dữ liệu hợp lệ.
Bảo trì và mở rộng dễ dàng: Nếu cần thay đổi cách dữ liệu được lưu trữ hoặc xử lý, ta chỉ cần chỉnh sửa bên trong lớp mà không ảnh hưởng đến phần còn lại của chương trình.
Tăng tính bảo mật: Hạn chế nguy cơ lỗi do các thành phần khác vô tình thay đổi dữ liệu.

    * */
}