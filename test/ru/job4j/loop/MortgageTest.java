package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MortgageTest {

    @Test
    public void when4Year() {
        int result = Mortgage.year(100, 70, 50);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void when1Year() {
        int result = Mortgage.year(1000, 1200, 1);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void when2Year() {
        int result = Mortgage.year(100, 120, 50);
        int expected = 2;
        assertThat(result, is(expected));
    }
}