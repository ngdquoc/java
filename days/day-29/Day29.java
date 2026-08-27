
import java.util.ArrayList;
import java.util.List;

public class Day29 {
    public static void main(String[] args) {
        TaskRepository repository = new InMemoryTaskRepository();
        repository.save(new Task(1, "Thiết kế Todo CLI", false));
        repository.findAll().forEach(System.out::println);
    }
}

record Task(int id, String title, boolean completed) {}

interface TaskRepository {
    void save(Task task);
    List<Task> findAll();
}

class InMemoryTaskRepository implements TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
    public void save(Task task) { tasks.add(task); }
    public List<Task> findAll() { return List.copyOf(tasks); }
}
