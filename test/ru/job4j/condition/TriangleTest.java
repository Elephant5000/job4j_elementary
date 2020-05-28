package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void areaRealTriangle() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 0.5;
        double out = triangle.area();
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void areaUnRealTriangle() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double expected = -1;
        double out = triangle.area();
        Assert.assertEquals(expected, out, 0.1);
    }
}