package StaticFinal;

public class RikkeiEducation {
    public RikkeiEducation() {
    }

    static {
        countVisited = 1;
    }

    static {
        countVisited = 2;
    }

    public static int countVisited = 0;

    public int getCountVisited() {
        return countVisited;
    }

    public void setCountVisited(int countVisited) {
        this.countVisited = countVisited;
    }

    public void visited() {
        countVisited++;
    }

    // Tất cả ca lớp người dùng định nghĩa mặc định kế thưa java.lang.Object
    @Override
    public String toString(){
        return "Thông tin của Rikkei Education";
    }
}
