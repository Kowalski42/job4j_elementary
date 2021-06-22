package ru.job4j.array;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        int border = (array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1);
        for (int index = 0; index < border; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {25, 36, 1, 100, 9, 0, 1000};
        back(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[] {6, 5, 4, 3, 2, 1};
        back(array2);
        System.out.println(Arrays.toString(array2));
    }
}
