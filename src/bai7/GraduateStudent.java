package bai7;

import java.util.Scanner;

public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        Scanner scanner = new Scanner(System.in);
        while (researchTopic == null || researchTopic.trim().isEmpty()) {
            System.out.println("Đề tài nghiên cứu không được để trống. Vui lòng nhập lại: ");
            researchTopic = scanner.nextLine();
        }
        while (supervisorName == null || supervisorName.trim().isEmpty()) {
            System.out.println("Tên giảng viên hướng dẫn không được để trống. Vui lòng nhập lại: ");
            supervisorName = scanner.nextLine();
        }

        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    public String getResearchTopic() {
        return researchTopic;
    }
    public void setResearchTopic(String researchTopic) {
        Scanner scanner = new Scanner(System.in);
        while (researchTopic == null || researchTopic.trim().isEmpty()) {
            System.out.println("Đề tài nghiên cứu không được để trống. Vui lòng nhập lại: ");
            researchTopic = scanner.nextLine();
        }
        this.researchTopic = researchTopic;
    }
    public void setSupervisorName(String supervisorName) {
        Scanner scanner = new Scanner(System.in);
        while (supervisorName == null || supervisorName.trim().isEmpty()) {
            System.out.println("Tên giảng viên hướng dẫn không được để trống. Vui lòng nhập lại: ");
            supervisorName = scanner.nextLine();
        }
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài nghiên cứu: " + researchTopic + ", Giảng viên hướng dẫn: " + supervisorName;
    }
}

