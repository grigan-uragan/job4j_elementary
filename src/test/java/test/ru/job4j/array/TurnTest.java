package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenLengthEven() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLengthNotEven() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        assertThat(result, is(expected));
    }
}