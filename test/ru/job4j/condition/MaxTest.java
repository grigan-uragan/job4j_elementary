package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(12, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenMaxEqualsThen1() {
        int result = Max.max(12, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(100, 24);
        assertThat(result, is(100));
    }

    @Test
    public void whenMax1To3Then1() {
        int result = Max.max(100, 24, 10);
        assertThat(result, is(100));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(100, 24, 10, 500);
        assertThat(result, is(500));
    }

    @Test
    public void whenAll4EqualThen1() {
        int result = Max.max(10, 10, 10, 10);
        assertThat(result, is(10));
    }
}