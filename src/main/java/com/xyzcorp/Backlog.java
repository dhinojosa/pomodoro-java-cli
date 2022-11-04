package com.xyzcorp;

import java.util.ArrayList;
import java.util.List;

public class Backlog {

    private final int limit;
    private final List<Task> tasks;

    public Backlog() {
        this(Integer.MAX_VALUE);
    }

    public Backlog(int limit) {
        this.tasks = new ArrayList<>();
        this.limit = limit;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        if (task == null)
            throw new NullPointerException("You cannot add a null task");
        if (tasks.size() == limit)
            throw new IllegalArgumentException("Task limit reached in backlog");
        this.tasks.add(task);
    }
}
