package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean element: data) {
            result = data[0] == element;
            if (!result) {
                break;
            }
        }
        return result;
    }
}
