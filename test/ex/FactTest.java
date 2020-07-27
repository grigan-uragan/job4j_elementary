package ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNumBelowZero() {
       Fact fact = new Fact();
       fact.calc(-5);
    }
}