package day22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int result = List.of(-2, 1, 2, 3, 4).stream()
                .filter(number -> number > 0 && number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();
        System.out.println("Tổng bình phương số chẵn dương: " + result);
    }
}
