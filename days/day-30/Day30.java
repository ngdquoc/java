
import java.util.ArrayList;
import java.util.List;

public class Day30 {
    public static void main(String[] args) {
        TodoService todo = new TodoService();
        int firstId = todo.add("Hoàn thành 30 ngày Java");
        todo.add("Xây dự án của riêng mình");
        todo.complete(firstId);

        System.out.println("TODO LIST");
        todo.all().forEach(task -> System.out.printf(
                "%d. [%s] %s%n",
                task.id(), task.completed() ? "x" : " ", task.title()));
    }
}

record Task(int id, String title, boolean completed) {
    Task {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Tiêu đề không được trống");
        }
    }
    Task complete() { return new Task(id, title, true); }
}

class TodoService {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    int add(String title) {
        Task task = new Task(nextId++, title.strip(), false);
        tasks.add(task);
        return task.id();
    }

    void complete(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).id() == id) {
                tasks.set(i, tasks.get(i).complete());
                return;
            }
        }
        throw new IllegalArgumentException("Không tìm thấy task #" + id);
    }

    List<Task> all() { return List.copyOf(tasks); }
}
