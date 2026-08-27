
public class Day06 {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("7 là số nguyên tố: " + isPrime(7));
    }

    static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) result *= i;
        return result;
    }

    static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
