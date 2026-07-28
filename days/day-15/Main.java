package day15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Đọc bài 15");
        tasks.add("Viết code");
        tasks.add("Làm bài tập");
        tasks.remove("Viết code");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, tasks.get(i));
        }
    }
}
