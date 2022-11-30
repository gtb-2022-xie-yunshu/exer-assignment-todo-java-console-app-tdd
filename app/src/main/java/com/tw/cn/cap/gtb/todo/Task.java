package com.tw.cn.cap.gtb.todo;

public class Task {
    private int id;
    private String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String format(){
        return ("%d %s".formatted(this.id,this.name));
    }
}