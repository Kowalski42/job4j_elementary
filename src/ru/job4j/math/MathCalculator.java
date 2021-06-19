package ru.job4j.math;

import java.util.Scanner;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumAndSubtractAndMultiplyAndDivide(double first, double second) {
        return sum(first, second)
                + subtract(first, second)
                + multiply(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        int digit1;
        int digit2 = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое целое число для расчета: ");
            digit1 = scanner.nextInt();
            while (digit2 == 0) {
                System.out.print("А теперь введите второе целое число для расчета (оно не должно быть равно 0): ");
                digit2 = scanner.nextInt();
            }
            System.out.println("Результат расчета метода sumAndMultiply равен: " + sumAndMultiply(digit1, digit2));
            System.out.println("Результат расчета метода subtractAndDivide равен: " + subtractAndDivide(digit1, digit2));
            System.out.println("Результат расчета метода sumAndSubtractAndMultiplyAndDivide равен: "
                    + sumAndSubtractAndMultiplyAndDivide(digit1, digit2));
        } catch (Exception e) {
            System.out.println("Введен некорректный формат данных");
        }
    }
}
