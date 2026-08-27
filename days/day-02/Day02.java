public class Day02 {
    public static void main(String[] args) {
        String name = "Tom";
        int age = 18;
        double height = 180;     
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
        int number = 10;
number = 20;

final int fixedNumber = 10;
// fixedNumber = 20; // This would cause a compile-time error
System.out.println("Fixed Num=10: " + number);

}
}
// Tên: An Str
// Tuổi: 20 int
// Chiều cao: 1,72 m double
// Đang học Java: true boolean
// Cấp độ: A char
// Khóa học: 30 Ngày Tự Học Java String
// Diện tích hình tròn: 78,54 double
