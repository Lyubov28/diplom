package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    String type;
    String task;
    List<String> listTask = new ArrayList<>();

    public void addTask(String task) {
        listTask.add(task);
    }

    public void removeTask(String task) {
        listTask.remove(task);
    }

    public String getAllTasks() {
        Collections.sort(listTask);
        StringBuilder list = new StringBuilder();
        for (String task : listTask) {
            list.append(task).append(" ");
        }
        return list.toString();
    }

    public String getType() {
        return type;
    }

    public String getTask() {
        return task;
    }
}
