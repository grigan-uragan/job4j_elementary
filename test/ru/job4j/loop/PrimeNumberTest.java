package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int result = PrimeNumber.primeNumberCounter(5);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void when11() {
        int result = PrimeNumber.primeNumberCounter(11);
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void when2() {
        int result = PrimeNumber.primeNumberCounter(2);
        int expected = 1;
        assertThat(result, is(expected));
    }
}