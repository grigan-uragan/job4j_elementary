package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Min;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {1, 4, 7, 10};
        int expected = 1;
        int result = Min.findMin(array);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLastMin() {
        int[] array = {100, 40, 79, 10};
        int expected = 10;
        int result = Min.findMin(array);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {11, 4, 7, 10};
        int expected = 4;
        int result = Min.findMin(array);
        assertThat(result, is(expected));
    }
}