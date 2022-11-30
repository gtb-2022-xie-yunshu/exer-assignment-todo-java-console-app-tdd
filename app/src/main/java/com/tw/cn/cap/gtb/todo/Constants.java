package com.tw.cn.cap.gtb.todo;

import java.io.File;
import java.nio.file.Path;

public class Constants {
    public static final String USER_HOME = System.getProperty("user.home");
    public static final String TODO = File.separator + ".todo";
    public static final String TASKS_NAME =  File.separator + "tasks";
    public static final Path PATH_OF_TASKS = Path.of(USER_HOME, TODO, TASKS_NAME);

    private Constants() {
    }
}