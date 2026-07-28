package day25;

import java.util.List;

public class Main {
    private static final double PASSING_SCORE = 5.0;

    public static void main(String[] args) {
        long passed = List.of(4.5, 5.0, 7.5, 9.0).stream()
                .filter(Main::isPassing)
                .count();
        System.out.println("Số người đạt: " + passed);
    }

    static boolean isPassing(double score) {
        return score >= PASSING_SCORE;
    }
}
