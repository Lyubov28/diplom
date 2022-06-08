package ru.netology.javacore;

import java.util.*;

public class Todos {
    protected List<String> listTask = new ArrayList<>();

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
}