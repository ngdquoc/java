package day24;

public class Main {
    public static void main(String[] args) {
        assert Calculator.add(2, 3) == 5;
        assert Calculator.isEven(0);
        assert !Calculator.isEven(3);
        System.out.println("Tất cả kiểm tra đều đạt.");
    }
}

class Calculator {
    static int add(int a, int b) { return a + b; }
    static boolean isEven(int number) { return number % 2 == 0; }
}
