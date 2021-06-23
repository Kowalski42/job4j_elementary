package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] == null) {
                for (int b = a + 1; b < array.length; b++) {
                    if (array[b] != null) {
                        array[a] = array[b];
                        array[b] = null;
                        break;
                    }
                }
            }
            System.out.print(array[a] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
