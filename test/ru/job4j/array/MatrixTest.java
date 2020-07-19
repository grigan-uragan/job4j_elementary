package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MatrixTest {

    @Test
    public void whenSize2() {
        int[][] result = Matrix.multiple(2);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(result, is(expected));
    }

    @Test
    public void whenSize3() {
        int[][] result = Matrix.multiple(3);
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(result, is(expected));
    }

    @Test
    public void whenSize4() {
        int[][] result = Matrix.multiple(4);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(result, is(expected));
    }

}