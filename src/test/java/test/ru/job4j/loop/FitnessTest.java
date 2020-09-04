package test.ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Fitness;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FitnessTest {

    @Test
    public void whenIvanGreatNikolaThenZeroMonth() {
        int result = Fitness.calc(100, 80);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIvanLessByOneNikola() {
        int result = Fitness.calc(90, 95);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIvanMoreLessNikola() {
        int result = Fitness.calc(50, 90);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIvanEqualNikola() {
        int result = Fitness.calc(90, 90);
        int expected = 1;
        assertThat(result, is(expected));
    }
}