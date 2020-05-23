package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
<<<<<<< HEAD

    @Test
    public void whenSumEvenNumbersFromOneToFiftyThenThirty() {
        int rsl = Counter.sumByEven(1, 50);
        int expected = 650;
        assertThat(rsl, is(expected));
    }
=======
>>>>>>> origin/master
}