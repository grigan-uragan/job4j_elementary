package test.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void when5ThenTrue() {
        boolean result = CheckPrimeNumber.check(5);
        assertThat(result, is(true));
    }

    @Test
    public void when4ThenFalse() {
        boolean result = CheckPrimeNumber.check(4);
        assertThat(result, is(false));
    }

    @Test
    public void when1ThenFalse() {
        boolean result = CheckPrimeNumber.check(1);
        assertThat(result, is(false));
    }

    @Test
    public void when11ThenTrue() {
        boolean result = CheckPrimeNumber.check(11);
        assertThat(result, is(true));
    }

    @Test
    public void when2ThenTrue() {
        boolean result = CheckPrimeNumber.check(2);
        assertThat(result, is(true));
    }
}