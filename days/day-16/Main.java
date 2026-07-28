package day16;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : "java dễ học java mạnh mẽ".split(" ")) {
            frequency.merge(word, 1, Integer::sum);
        }
        frequency.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
