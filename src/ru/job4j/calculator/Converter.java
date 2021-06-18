package ru.job4j.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int amount = 0;
        try (Scanner scanner = new Scanner(System.in);) {
            do {
                System.out.print("Please, input amount in rubles for exchange: ");
                amount = scanner.nextInt();
            } while (amount == 0);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect format of input data. Exchange is interrupting...");
            e.printStackTrace();
            return;
        }
        int euro = Converter.rubleToEuro(amount);
        System.out.printf("%d rubles are %d euro.\n", amount, euro);
        int usd = Converter.rubleToDollar(amount);
        System.out.printf("%d rubles are %d usd.", amount, usd);
    }
}
