package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {105, 7, 51};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 51, 105};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[] {89, 101, 51, 1, 25, 70, 48};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 25, 48, 51, 70, 89, 101};
        Assert.assertArrayEquals(expected, result);
    }
}