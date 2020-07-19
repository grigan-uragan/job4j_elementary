package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FindLoopTest {

    @Test
    public void when12345Element2Then1() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 2;
        int expected = 1;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(expected));
    }

    @Test
    public void when12345Element6ThenMinusOne() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 6;
        int expected = -1;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(expected));
    }

    @Test
    public void when12345Element5Then4() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 5;
        int expected = 4;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(expected));
    }
}