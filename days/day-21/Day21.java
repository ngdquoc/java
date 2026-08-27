
import java.util.List;
import java.util.function.Predicate;

public class Day21 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        numbers.forEach(number -> {
            if (isEven.test(number)) System.out.println(number + " là số chẵn");
        });
    }
}
