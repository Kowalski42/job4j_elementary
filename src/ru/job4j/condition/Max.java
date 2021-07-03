package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second; //если два числа равны, то возращается первое
    }

    public static int max(int first, int second, int third) {
        int digit = max(second, third);
        return first >= digit ? first : digit;
    }

    public static int max(int first, int second, int third, int forth) {
        int digit = max(second, third, forth);
        return first >= digit ? first : digit;
    }

    public static void main(String[] args) {
       System.out.println(max(10, 5));
    }
}