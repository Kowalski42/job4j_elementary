package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        //реализуем поиск простого числа методом оптимизированного перебора делителей
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
