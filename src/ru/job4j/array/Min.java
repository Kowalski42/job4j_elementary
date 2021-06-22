package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int element: array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
}
