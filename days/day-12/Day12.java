
public class Day12 {
    public static void main(String[] args) {
        Notifier[] notifiers = {new EmailNotifier(), new ConsoleNotifier()};
        for (Notifier notifier : notifiers) notifier.send("Chào mừng!");
    }
}

interface Notifier { void send(String message); }

class EmailNotifier implements Notifier {
    public void send(String message) { System.out.println("Email: " + message); }
}

class ConsoleNotifier implements Notifier {
    public void send(String message) { System.out.println("Console: " + message); }
}
