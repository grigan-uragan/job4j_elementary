package test.ru.job4j.sort;

import org.junit.Test;
import ru.job4j.sort.Machine;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {

    @Test
    public void whenPrice35Money50() {
        int[] result = new Machine().change(50, 35);
        int[] expected = {10, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenPrice33Money50() {
        int[] result = new Machine().change(50, 33);
        int[] expected = {10, 5, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenEqualse() {
        int[] result = new Machine().change(50, 50);
        int[] expected = {};
        assertThat(result, is(expected));
    }
}