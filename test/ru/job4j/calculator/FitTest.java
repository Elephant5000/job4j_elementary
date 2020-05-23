package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 185;
        double out = Fit.manWeight(in);
        double expect = 97;
        Assert.assertEquals(expect, out, 0.9);
    }

    @Test
    public void womanWeight() {
        double in = 165;
        double expect = 63;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expect, out, 0.9);
    }
}