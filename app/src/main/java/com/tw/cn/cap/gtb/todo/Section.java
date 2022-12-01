package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private final String title;
    private final boolean flag;

    public Section(String title, boolean flag) {
        this.title = title;
        this.flag = flag;
    }

    static Section getCompleted() {
        return new Section("# Completed", true);
    }

    static Section getTbd() {
        return new Section("# To be done", false);
    }

    List<String> format(List<Task> loadTasks) {
        final var sectionTaskList = new ArrayList<String>();
        sectionTaskList.add(title);
<<<<<<< HEAD
        if (loadTasks.size() == 0) {
            sectionTaskList.add("# Empty");
            return sectionTaskList;
        }
        loadTasks.stream()
           .filter(this::isTypeMatches)
=======
        loadTasks.stream()
           .filter(task -> isTypeMatches(task))
>>>>>>> ac21c3a (refactor: extract Section Class)
           .map(Task::format)
           .forEach(sectionTaskList::add);
        return sectionTaskList;
    }

    private boolean isTypeMatches(Task task) {
        return flag == task.isCompleted();
    }
}