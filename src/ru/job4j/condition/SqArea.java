package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1)); // расчет высоты прямоугольника, зная p - периметр и k - соотношение длины к высоте
        double L = h * k; // расчет длины прямоугольника
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, real s = " + result1);
    }
}
