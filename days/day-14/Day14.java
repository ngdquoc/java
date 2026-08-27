
public class Day14 {
    public static void main(String[] args) {
        for (String input : new String[]{"25", "hai mươi"}) {
            try {
                System.out.println("Tuổi: " + Integer.parseInt(input));
            } catch (NumberFormatException error) {
                System.out.println("'" + input + "' không phải số");
            }
        }
    }
}
