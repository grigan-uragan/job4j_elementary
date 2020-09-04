package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSwap0To1() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {2, 1, 3, 4};
        int[] result = SwitchArray.swap(input, 0, 1);
        assertThat(result, is(expected));
    }
}