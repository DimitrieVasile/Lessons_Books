package homework_nr_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskList {
    public static List<String> getTodayTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("1.Buy groceries");
        tasks.add("2.Finish report for work");
        tasks.add("3.Call mom");
        tasks.add("4.Go to the gym");
        tasks.add("5.Pay bills");
        tasks.add("6.Clean the house");
        tasks.add("7.Plan weekend activities");
        return tasks;
    }

    public static Set<String> findUniqueValues(List<String> values) {
        return new HashSet<>(values);
    }

    public static void main(String[] args) {
        // Получаем список дел на сегодня
        List<String> todayTasks = getTodayTasks();
        System.out.println("To-do list for today:");
        for (String task : todayTasks) {
            System.out.println(task);
        }
        Set<String> uniqueValues = findUniqueValues(todayTasks);
        System.out.println("\nUnique tasks:");
        for (String value : uniqueValues) {
            System.out.println(value);
        }
    }
}