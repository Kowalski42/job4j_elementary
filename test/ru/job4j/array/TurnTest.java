package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {100, 19, 16, 72, 36, 40, 85};
        int[] result = Turn.back(input);
        int[] expected = new int[] {85, 40, 36, 72, 16, 19, 100};
        Assert.assertArrayEquals(expected, result);
    }
}