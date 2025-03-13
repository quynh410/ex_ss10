public class String_Builder_Demo {
    public static void main(String[] args) {
        StringBuilder raBuilder  = new StringBuilder("Rikkei Âcdemy");
        raBuilder.append(" - học viện đào tạo CNTT");
        System.out.println("Kết quả nối chuỗi:" + raBuilder.toString());
        raBuilder.insert(7, "Education ");
        System.out.println("Kết quả khi chèn: " + raBuilder);
        raBuilder.replace(7, 17, "");
        System.out.println("Kết quả  khi thay thế : " + raBuilder.toString());
        raBuilder.delete(7, 17);
        System.out.println("Kết quả sau khi xóa: " + raBuilder);
        raBuilder.reverse();
        System.out.println("Kết quả sau khi đảo ngược: " + raBuilder);
    }
}
