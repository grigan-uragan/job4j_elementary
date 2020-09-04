package test.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenPerimeterZeroThenReturnMinusOne() {
        int k = 2;
        int perimeter = 0;
        double expected = -1;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenKZeroThenReturnMinusOne() {
        int k = 0;
        int perimeter = 10;
        double expected = -1;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenKTwoPerimeterTenThenSquareFive() {
        int k = 2;
        int perimeter = 10;
        double expected = 5.55;
        double out = SqArea.square(perimeter, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}