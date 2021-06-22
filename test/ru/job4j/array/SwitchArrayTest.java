package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 79, 135, 2, 0, 45};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 79, 0, 2, 135, 45};
        Assert.assertArrayEquals(expected, result);
    }
}