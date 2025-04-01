import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTaskByName(String name) {
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(name));
    }

    public List<Task> sortTasksByPriority() {
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparing(Task::getPriority).reversed()); // HIGH → LOW
        return sorted;
    }
}
