package test.ex;

import ex.Fact;
import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNumBelowZero() {
       Fact fact = new Fact();
       fact.calc(-5);
    }
}