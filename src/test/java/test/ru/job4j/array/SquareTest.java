package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Square;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int[] result = Square.calculate(3);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenBound5Then014916() {
        int[] result = Square.calculate(5);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result, is(expected));
    }
}