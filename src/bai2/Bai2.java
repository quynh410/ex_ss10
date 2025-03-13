package bai2;

public class Bai2 {
    /*
        1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?
Kế thừa (Inheritance) là một trong bốn tính chất quan trọng của lập trình hướng đối tượng (OOP). Nó cho phép một lớp (gọi là lớp con – subclass) kế thừa các thuộc tính và phương thức từ một lớp khác (gọi là lớp cha – superclass).

Lợi ích của kế thừa:
Tái sử dụng mã nguồn: Giảm thiểu việc lặp lại mã bằng cách sử dụng lại các thuộc tính và phương thức của lớp cha.
Tổ chức và mở rộng chương trình: Dễ dàng mở rộng chức năng mà không làm ảnh hưởng đến mã gốc.
Dễ bảo trì và nâng cấp: Khi thay đổi logic trong lớp cha, các lớp con tự động nhận được sự thay đổi này.
Thể hiện mối quan hệ “is-a”: Nếu một đối tượng có mối quan hệ “là một loại” của một đối tượng khác, thì kế thừa là một lựa chọn hợp lý.
2. Sự khác biệt giữa kế thừa và đóng gói trong Java
Đặc điểm	Kế thừa (Inheritance)	Đóng gói (Encapsulation)
Mục đích	Tái sử dụng mã nguồn, mở rộng chức năng	Bảo vệ dữ liệu, kiểm soát truy cập
Cách thực hiện	Dùng từ khóa extends để tạo lớp con kế thừa từ lớp cha	Dùng mức độ truy cập (private, protected, public) và các phương thức getter, setter
Lợi ích chính	Giúp xây dựng mối quan hệ giữa các lớp, giảm trùng lặp mã	Đảm bảo tính bảo mật và toàn vẹn dữ liệu
Ví dụ	Lớp Dog kế thừa từ Animal	Thuộc tính age là private và chỉ có thể thay đổi thông qua setter
3. Ví dụ sử dụng từ khóa extends để tạo lớp con kế thừa lớp cha
Dưới đây là một ví dụ minh họa về kế thừa trong Java:

java
Sao chép mã
// Lớp cha (Superclass)
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Phương thức hiển thị thông tin
    public void makeSound() {
        System.out.println(name + " phát ra âm thanh!");
    }
}

// Lớp con (Subclass) kế thừa từ Animal
class Dog extends Animal {
    String breed;

    // Constructor của Dog (gọi lại constructor của Animal bằng super)
    public Dog(String name, String breed) {
        super(name);  // Gọi constructor của lớp cha
        this.breed = breed;
    }

    // Phương thức riêng của Dog
    public void wagTail() {
        System.out.println(name + " đang vẫy đuôi!");
    }
}

// Lớp Main để chạy chương trình
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Gọi phương thức từ lớp cha
        myDog.makeSound();  // Kế thừa từ Animal

        // Gọi phương thức riêng của Dog
        myDog.wagTail();
    }
}
Kết quả khi chạy chương trình:
css
Sao chép mã
Buddy phát ra âm thanh!
Buddy đang vẫy đuôi!
Giải thích:

Lớp Animal có một thuộc tính name và một phương thức makeSound().
Lớp Dog kế thừa từ Animal, có thêm thuộc tính breed và phương thức riêng wagTail().
Khi khởi tạo Dog, nó gọi constructor của Animal thông qua super(name).
Đối tượng Dog có thể sử dụng phương thức makeSound() của lớp cha và phương thức riêng wagTail().
4. Lợi ích và hạn chế của kế thừa trong Java
Lợi ích của kế thừa:
✅ Tái sử dụng mã nguồn: Giúp tránh lặp lại code bằng cách sử dụng lại các thuộc tính và phương thức từ lớp cha.
✅ Dễ mở rộng và bảo trì: Khi cập nhật lớp cha, các lớp con tự động nhận được các thay đổi mà không cần chỉnh sửa từng lớp riêng lẻ.
✅ Thể hiện mối quan hệ giữa các đối tượng: Dễ dàng mô hình hóa mối quan hệ thực tế giữa các thực thể.

Hạn chế của kế thừa:
❌ Kết nối chặt chẽ giữa các lớp: Nếu thay đổi lớp cha, lớp con cũng có thể bị ảnh hưởng, dẫn đến khó quản lý khi dự án lớn.
❌ Có thể dẫn đến kế thừa không cần thiết: Nếu không thiết kế hợp lý, lớp con có thể kế thừa những phương thức không cần thiết từ lớp cha.
❌ Giới hạn khả năng mở rộng: Trong Java, một lớp chỉ có thể kế thừa từ một lớp cha duy nhất (Java không hỗ trợ đa kế thừa trực tiếp).

Tóm lại:
Kế thừa giúp tái sử dụng mã nguồn, tổ chức chương trình tốt hơn.
Sử dụng extends để tạo lớp con kế thừa từ lớp cha.
Cần thiết kế kế thừa hợp lý để tránh các vấn đề về bảo trì và phụ thuộc quá nhiều vào lớp cha.
    * */
}
