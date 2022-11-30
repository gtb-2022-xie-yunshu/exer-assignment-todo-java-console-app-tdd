package com.tw.cn.cap.gtb.todo;

public class TaskFactory {
    private TaskFactory() {
    }
   public static Task createTask(int id, String line) {
       final var eleOfLine = line.split(" ", 3);
       final var name = eleOfLine[2];
       Task task = null;
       if (eleOfLine[1].equals("+")) {
           final var completed = false;
           task = new Task(id, name, completed);
       }else if(eleOfLine[1].equals("-")){
           final var completed = true;
           task = new Task(id, name, completed);
       }

       return task;
   }

}