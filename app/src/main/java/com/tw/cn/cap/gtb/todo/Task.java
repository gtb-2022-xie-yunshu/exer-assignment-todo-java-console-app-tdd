package com.tw.cn.cap.gtb.todo;

public class Task {

    private final int id;
    private final String name;
    private final boolean completed;

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }


    public Task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public String format(){
        return ("%d %s".formatted(this.id,this.name));
    }
}