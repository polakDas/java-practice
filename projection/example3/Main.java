package projection.example3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("This is task-1");
        Task task2 = new Task("Task-2 is here");
        Task task3 = new Task("Here is task-3");

        Employee employee1 = new Employee("Employee-1");
        Employee employee2 = new Employee("Employee-2");

        employee1.setTask(task1);
        employee1.setTask(task2);

        employee2.setTask(task3);
        employee2.setTask(task2);

        List<Employee> employees = Arrays.asList(employee1, employee2);

        List<String> employeeWithTasks = employees.stream()
                .map(employee -> employee.getName() + ": " + employee.getTasks().stream()
                        .map(Task::getTask).collect(Collectors.joining(",")))
                .collect(Collectors.toList());

        employeeWithTasks.forEach(et -> System.out.println(et));
//        System.out.println(employeeWithTasks);
    }
}
