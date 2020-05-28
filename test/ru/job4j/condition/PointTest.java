package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(10, 10);
        double expected = 14.1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}