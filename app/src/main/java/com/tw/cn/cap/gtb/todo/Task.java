package com.tw.cn.cap.gtb.todo;

public class Task {
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

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String format(){
        return ("%d %s".formatted(this.id,this.name));
    }
}