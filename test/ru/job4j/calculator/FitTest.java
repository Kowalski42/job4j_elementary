package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import static ru.job4j.calculator.Fit.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}