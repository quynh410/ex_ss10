package StaticFinal;


public class Demo {
    public static void main(String[] args) {
        RikkeiEducation guest1 = new RikkeiEducation();
        guest1.visited();

        System.out.println("So lượt truy cập: " + guest1.getCountVisited());

        RikkeiEducation guest2 = new RikkeiEducation();
        guest2.visited();

        System.out.println("So lượt truy cập: " + RikkeiEducation.countVisited);

        RikkeiEducation guest3 = new RikkeiEducation();
        guest3.visited();

        System.out.println("So lượt truy cập: " + guest3.getCountVisited());

        // Tính tong 2 so 5 va 10

        System.out.println(guest1.toString());
    }
}
