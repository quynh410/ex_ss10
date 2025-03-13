package bai4;

public class ReadBook {
    public static void main(String[] args) {
        Book myBook = new Book("Rikkei Academy", "Nguyễn Văn A", 150000);

        System.out.println("Thông tin sách ban đầu:");
        myBook.displayBookInfo();

        myBook.setTitle("Rikkei Education");
        myBook.setAuthor("Trần Thịa B");
        myBook.setPrice(200000);
        myBook.setPrice(-50000);

        System.out.println("\nThông tin sách sau khi cập nhật:");
        myBook.displayBookInfo();
    }
}
