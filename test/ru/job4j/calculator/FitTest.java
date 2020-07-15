package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeightTwoMeterThenManWeight() {
        short in = 200;
        double expected = 115;
        double out = Fit.manWeight(in);

        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWomanHeightTwoMeterThenWomanWeight() {
        short in = 200;
        double expected = 103.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}