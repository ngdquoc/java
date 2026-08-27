
import java.util.List;
import java.util.Optional;

public class Day23 {
    public static void main(String[] args) {
        Optional<String> found = List.of("An", "Bình", "Chi").stream()
                .filter(name -> name.equalsIgnoreCase("bình"))
                .findFirst();
        System.out.println(found.map(name -> "Tìm thấy: " + name)
                .orElse("Không tìm thấy"));
    }
}
