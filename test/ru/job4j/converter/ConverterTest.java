package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 225;
        int expected = 3;
        int out = Converter.rubTousd(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 170;
        int expected = 2;
        int out = Converter.rubToeur(in);
        Assert.assertEquals(expected, out);
    }
}