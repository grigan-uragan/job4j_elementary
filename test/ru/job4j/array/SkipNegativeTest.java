package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenNegativeAndZero() {
        int[][] in = {
                {1, -2},
                {1, 2},
                {0, -40}
        };
        int[][] expect = {
                {1, 0},
                {1, 2},
                {0, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}