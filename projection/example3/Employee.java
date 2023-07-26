package projection.example3;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Task> tasks;

    public Employee(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTask(Task task) {
        this.tasks.add(task);
    }
}
