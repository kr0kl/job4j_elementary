package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicNotTest {

    @Test
    public void isEven() {
        boolean result = LogicNot.isEven(32);
        assertThat(result, is(true));
    }

    @Test
    public void isPositive() {
        boolean result = LogicNot.isPositive(32);
        assertThat(result, is(true));
    }

    @Test
    public void notEven() {
        boolean result = LogicNot.notEven(33);
        assertThat(result, is(true));
    }

    @Test
    public void notPositive() {
        boolean result = LogicNot.notPositive(-33);
        assertThat(result, is(true));
    }

    @Test
    public void notEvenAndPositive() {
        boolean result = LogicNot.notEvenAndPositive(33);
        assertThat(result, is(true));
    }

    @Test
    public void evenOrNotPositive() {
        boolean result = LogicNot.evenOrNotPositive(-3);
        assertThat(result, is(true));
    }
}