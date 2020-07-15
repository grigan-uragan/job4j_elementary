package ru.job4j.calculate;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenAllArgsIsOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int out = X2.calc(a, b, c, x);

        assertThat(expected, is(out));
    }

    @Test
    public void whenAZero() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);

        assertThat(expected, is(out));
    }

    @Test
    public void whenCZero() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);

        assertThat(expected, is(out));
    }

    @Test
    public void whenXZero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = X2.calc(a, b, c, x);

        assertThat(expected, is(out));
    }

    @Test
    public void whenBCZero() {
        int a = 1;
        int b = 0;
        int c = 0;
        int x = 1;
        int expected = 1;
        int out = X2.calc(a, b, c, x);

        assertThat(expected, is(out));
    }
}