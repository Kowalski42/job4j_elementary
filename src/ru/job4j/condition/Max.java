package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second; //если два числа равны, то возращается первое
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, third, forth));
    }

    public static void main(String[] args) {
       System.out.println(max(10, 5));
    }
}