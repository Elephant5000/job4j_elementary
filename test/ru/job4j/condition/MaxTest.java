package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then2() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMaxThree() {
        int result = Max.max(5, 3, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMaxFour() {
        int result = Max.max(5, 3, 2, 4);
        assertThat(result, is(5));
    }

}