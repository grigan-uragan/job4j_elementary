package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort5Elements() {
        int[] data = {7, 5, 48, 0, 34};
        int[] expected = {0, 5, 7, 34, 48};
        int[] result = SortSelected.sort(data);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort7Elements() {
        int[] data = {7, 5, 48, 0, 34, 100, -4};
        int[] expected = {-4, 0, 5, 7, 34, 48, 100};
        int[] result = SortSelected.sort(data);
        assertThat(result, is(expected));
    }
}