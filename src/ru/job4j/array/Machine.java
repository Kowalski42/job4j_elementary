package ru.job4j.array;

import java.util.*;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] change = new int[100];
        int coinCounter = 0;
        int i = 0;
        money -= price;
        while (money != 0) {
            if (money < coins[i]) {
                i++;
            } else {
                change[coinCounter++] = coins[i];
                money -= coins[i];
            }
        }
        return Arrays.copyOf(change, coinCounter);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(9, 7)));
    }
}
