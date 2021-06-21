package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialFor5Then120() {
        int in = 5;
        int out = Factorial.calc(in);
        int expected = 120;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int in = 0;
        int out = Factorial.calc(in);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}