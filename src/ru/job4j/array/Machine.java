package ru.job4j.array;

import java.util.*;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        rsl[0] = money - price;
        int i = 0;
        for (int j = 0; j < rsl.length; j++) {
            if (rsl[j] - coins[i] > 0) {
                rsl[j + 1] = rsl[j] - coins[i];
                rsl[j] = coins[i];
                size++;
                if (rsl[j + 1] < coins[i]) {
                    i++;
                }
            } else if (rsl[j] - coins[i] == 0) {
                rsl[j] = coins[i];
                size++;
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(80, 21)));
    }
}
