package test.ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Check;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenAllTrueThenTrue() {
        boolean[] input = {true, true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenAllFalseThenTrue() {
        boolean[] input = {false, false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenTrueAndFalseThenFalse() {
        boolean[] input = {true, true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}