package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = {-1, 0, 5, 10, 4};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenLastMin() {
        int[] array = {-1, 0, 5, 10, -4};
        int start = 1;
        int finish = 4;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = -4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {-1, 0, 5, 10, 4};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        assertThat(result, is(expected));
    }
}