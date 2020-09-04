package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void when12345Element2Then1() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 2;
        int expected = 1;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(expected));
    }

    @Test
    public void when12345Element6ThenMinusOne() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 6;
        int expected = -1;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(expected));
    }

    @Test
    public void when12345Element5Then4() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int el = 5;
        int expected = 4;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}