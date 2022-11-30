package com.tw.cn.cap.gtb.todo;

public class Task {
<<<<<<< HEAD
<<<<<<< HEAD
    private int id;
    private String name;
=======
    private final int id;
    private final String name;
    private final boolean completed;

    public boolean isCompleted() {
        return completed;
    }
>>>>>>> e5ad5c6 (feat: show completed taskList)
=======
    private final int id;
    private final String name;
    private boolean completed;
>>>>>>> 4c64ecf (feat: parse `completed` field of task & add taskFactory)

    public Task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public String format(){
        return ("%d %s".formatted(this.id,this.name));
    }
}