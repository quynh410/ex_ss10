package bai7;

public class Run {
    public static void main(String[] args) {
        Student[] students = new Student[6];

        students[0] = new Student("Nguyễn Văn A", "SV001", 3.5);
        students[1] = new Student("Trần Thị B", "SV002", 2.8);
        students[2] = new GraduateStudent("Lê Văn C", "SV003", 3.9, "Trí tuệ nhân tạo", "GS. Phạm Quốc D");
        students[3] = new GraduateStudent("Hoàng Thị D", "SV004", 3.7, "Học máy", "GS. Nguyễn Văn E");

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getDetails());
            }
        }

        // Kiểm tra
        try {
            students[4] = new Student("Lý Văn F", "SV005", 5.0); // GPA
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi khi tạo sinh viên: " + e.getMessage());
        }

        try {
            students[5] = new GraduateStudent("Vũ Thị G", "SV006", 3.6, "", "GS. Đặng Văn H");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi khi tạo sinh viên tốt nghiệp: " + e.getMessage());
        }
    }
}
