package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 2, 9);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(10, 20, 5);
        assertThat(result, is(20));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(10, 20, 50);
        assertThat(result, is(50));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(10, 10, 10);
        assertThat(result, is(10));
    }
}