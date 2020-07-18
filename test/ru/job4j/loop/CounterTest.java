package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTwelveThenFortyTwo() {
        int result = Counter.sumByEven(1, 12);
        int expected = 42;
        assertThat(result, is(expected));
    }
}