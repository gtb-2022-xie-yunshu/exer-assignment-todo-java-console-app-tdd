package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

/**
 * @create 2022/12/1-18:37
 */
class SectionTest {
    @Test
    void should_show_hint_msg_when_no_tasks() {
        Assertions.assertEquals(List.of("# To be done", "# Empty")
                , Section.getTbd().format(Collections.emptyList()));
        Assertions.assertEquals(List.of("# Completed", "# Empty")
                , Section.getCompleted().format(Collections.emptyList()));
    }
}