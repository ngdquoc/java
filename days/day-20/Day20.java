
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day20 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2026, 7, 1);
        LocalDate end = start.plusDays(30);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Bắt đầu: " + start.format(format));
        System.out.println("Kết thúc: " + end.format(format));
    }
}
