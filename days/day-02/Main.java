package day02;

public class Main {
    public static void main(String[] args) {
        String name = "An";
        int age = 20;
        double height = 1.72;
        boolean learningJava = true;
        char level = 'A';

        final String courseName = "30 Ngày Tự Học Java";
        final double PI = 3.14159;
        double radius = 5;
        double area = PI * radius * radius;

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.printf("Chiều cao: %.2f m%n", height);
        System.out.println("Đang học Java: " + learningJava);
        System.out.println("Cấp độ: " + level);
        System.out.println("Khóa học: " + courseName);
        System.out.printf("Diện tích hình tròn: %.2f%n", area);
    }
}
