package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
        public void whenDayMonday() {
            int name = MultipleSwitchWeek.numberOfDay("Понедельник");
            assertThat(name, is(1));
    }
    @Test
    public void whenDayError() {
        int name = MultipleSwitchWeek.numberOfDay("Жопельник");
        assertThat(name, is(-1));
    }
}