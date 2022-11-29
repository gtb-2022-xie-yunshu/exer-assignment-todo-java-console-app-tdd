/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void should_list_exiting_tasks(){
        final var result = new App().run();
        Assertions.assertEquals(List.of("task 001","task 002","task 003"),result);
    }

}
