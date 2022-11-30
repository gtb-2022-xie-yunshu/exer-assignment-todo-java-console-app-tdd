package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public TaskRepository() {
    }

    public List<Task> loadTasks() {
        List<String> tasks = readTaskLines();
        List<Task> taskList = new ArrayList<>();
        for (int i = 0; i < tasks.size() ; i++) {
        final var id = i + 1;
        final var line = tasks.get(i);
        final Task task = createTask(id, line);
        taskList.add(task);
        }
        return taskList;
    }

    private Task createTask(int id, String line) {
        final var name = line.split(" ", 2)[1];
        return new Task(id, name);
    }

    public List<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.PATH_OF_TASKS).stream().toList();
        } catch (IOException e) {
            throw new TodoCanNotReadFileException();
        }
    }
}