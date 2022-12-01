package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTest {

    @Test
    void should_parse_completed_for_task() {
        assertFalse(TaskFactory.createTask(1, " + foo").isCompleted());
    }

    @Test
    void should_support_name_with_multiple_blanks() {
        Assertions.assertEquals("foo     bar",TaskFactory.createTask(1," + foo     bar").getName());
    }
}