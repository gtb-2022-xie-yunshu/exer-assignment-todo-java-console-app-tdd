/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppTest {

    @Test
    void should_list_exiting_tasks(){
        final var result = new App().run();
        Assertions.assertEquals(
                List.of("# To be done"
                ,"1 task 001"
                ,"2 task 002"
                ,"# Completed"
                ,"3 task 003"
                ,"4 task 004"
                        ),result);
}

}
