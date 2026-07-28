package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path file = Files.createTempFile("java-day-19-", ".txt");
        Files.write(file, List.of("Học Path", "Học Files"));
        Files.readAllLines(file).forEach(System.out::println);
        Files.deleteIfExists(file);
    }
}
