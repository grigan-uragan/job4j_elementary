package test.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void whenPointEqualsThenResultZero() {
        Point first = new Point(10, 10);
        Point second = new Point(10, 10);
        double result = first.distance(second);
        double expected = 0;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void whenPointDifferenceThenResultMoreThanZero() {
        Point first = new Point(0, 0);
        Point second = new Point(10, 10);
        double result = first.distance(second);
        double expected = 14.14;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void when3DPointEqualsThenResultZero() {
        Point first = new Point(10, 10, 10);
        Point second = new Point(10, 10, 10);
        double result = first.distance3d(second);
        double expected = 0;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void when3DPointDifferenceThenResultMoreThanZero() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(10, 10, 10);
        double result = first.distance3d(second);
        double expected = 17.32;
        Assert.assertEquals(result, expected, 0.01);
    }
}