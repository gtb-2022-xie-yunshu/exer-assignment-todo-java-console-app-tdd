package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTest {

    @Test
    void should_parse_completed_for_task() {
        assertFalse(TaskFactory.createTask(1, " + foo").isCompleted());
    }

    @Test
    void should_() {
    }
}