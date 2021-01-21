package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 4, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(7, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(9, 9, 9);
        assertThat(result, is(9));
    }

    @Test
    public void when10Max() {
        int result = MultiMax.max(1, 10, 10);
        assertThat(result, is(10));
    }
}