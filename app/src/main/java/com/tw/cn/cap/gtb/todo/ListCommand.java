package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class ListCommand {
    final TaskRepository taskRepository = new TaskRepository();

    public ListCommand() {
    }

    public List<String> run() {
        List<Task> loadTasks = taskRepository.loadTasks();
        List<String> taskList = new ArrayList<>();

        taskList.addAll(Section.getTbd().format(loadTasks));
        taskList.addAll(Section.getCompleted().format(loadTasks));

        return taskList;
    }
}