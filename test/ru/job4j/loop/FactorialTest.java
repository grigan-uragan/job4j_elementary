package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FactorialTest {

    @Test
    public void whenNumberFiveThenFactorialOneHundredTwenty() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void whenNumberZeroThenFactorialOne() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}