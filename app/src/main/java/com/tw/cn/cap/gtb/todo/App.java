/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
        throw  new UnsupportedOperationException();
    }

    public List<String> run() {
        List<String> readList = getList();
        final var taskList = new ArrayList<String>();
        taskList.add("#To be done");
        taskList.addAll(readList);
        return taskList;
    }

    private List<String> getList() {
        try {
           return Files.readAllLines(Constants.PATH_OF_TASKS).stream().toList();
        } catch (IOException e) {
            throw new TodoCanNotReadFileException();
        }
    }
}
