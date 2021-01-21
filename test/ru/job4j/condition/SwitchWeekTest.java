package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test

        public void whenDayFriday() {
            String name = SwitchWeek.nameOfDay(5);
            assertThat(name, is("Friday"));
    }

    @Test

    public void whenDayError() {
        String name = SwitchWeek.nameOfDay(8);
        assertThat(name, is("Ошибка"));
    }
}