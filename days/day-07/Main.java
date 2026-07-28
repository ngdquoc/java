package day07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] scores = {8, 6, 9, 10, 7};
        int total = 0;
        for (int score : scores) total += score;
        System.out.println(Arrays.toString(scores));
        System.out.println("Trung bình: " + (double) total / scores.length);
    }
}
