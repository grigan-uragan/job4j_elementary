package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenOneSideZeroThenFalse() {
        assertThat(Triangle.exist(2.0, 0, 2.0), is(false));
    }

    @Test
    public void whenAllSide2ThenTrue() {
        assertThat(Triangle.exist(2, 2, 2), is(true));
    }

    @Test
    public void whenOneSideVeryBigThenFalse() {
        assertThat(Triangle.exist(100, 2, 3), is(false));
    }
}