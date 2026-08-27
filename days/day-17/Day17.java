
public class Day17 {
    public static void main(String[] args) {
        Box<String> message = new Box<>("Học generic");
        Box<Integer> score = new Box<>(10);
        System.out.println(message.value());
        System.out.println(score.value());
    }
}

record Box<T>(T value) {}
