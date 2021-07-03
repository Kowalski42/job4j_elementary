package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int first = 3;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int first = 10;
        int second = 10;
        int result = Max.max(first, second);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1to10Then10() {
        int first = 3;
        int second = 1;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3to3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax13To100to3to45Then100() {
        int first = 13;
        int second = 100;
        int third = 3;
        int forth = 45;
        int result = Max.max(first, second, third, forth);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax13To95to3to95Then95() {
        int first = 13;
        int second = 95;
        int third = 3;
        int forth = 95;
        int result = Max.max(first, second, third, forth);
        int expected = 95;
        Assert.assertEquals(result, expected);
    }
}