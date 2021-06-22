package ru.job4j.array;

import java.util.Arrays;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int count = 1;
        array[0][0] = count;
        array[0][1] = ++count;
        array[0][2] = ++count;
        array[1][0] = ++count;
        array[1][1] = ++count;
        array[1][2] = ++count;
        array[2][0] = ++count;
        array[2][1] = ++count;
        array[2][2] = ++count;
        /*for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = count;
                count++;
            }
        }*/
        for (int[] a: array) {
            for (int b: a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
