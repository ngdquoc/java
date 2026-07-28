package day03;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println("Tổng: " + (a + b));
        System.out.println("Chia nguyên: " + (a / b));
        System.out.println("Chia thực: " + ((double) a / b));
        System.out.println("a dương và chẵn: " + (a > 0 && a % 2 == 0));
    }
}
