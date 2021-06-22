package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива " + ages.getClass().getSimpleName() + " ages - " + ages.length);
        System.out.println("Размер массива " + surnames.getClass().getSimpleName() + " surnames - " + surnames.length);
        System.out.println("Размер массива " + prices.getClass().getSimpleName() + " prices - " + prices.length);

        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = "Человек №" + (i + 1);
        }
        for (String e: names) {
            System.out.println(e);
        }
        System.out.println("Размер массива " + names.getClass().getSimpleName() + " names - " + names.length);
    }
}
