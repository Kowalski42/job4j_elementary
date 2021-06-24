package ru.job4j.array;

import java.util.*;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0; // для движения в массиве сдачи int[] rsl
        int i = 0; // для движения в массиве монет int[] coins
        int rest = money - price;
        while (rest != 0) {
            if (rest < coins[i]) {
                i++;
            } else {
                rsl[size] = coins[i];
                rest -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(25, 7)));
    }
}
