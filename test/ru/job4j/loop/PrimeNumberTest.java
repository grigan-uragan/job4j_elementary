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
}