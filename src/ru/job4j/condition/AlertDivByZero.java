package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not divide by 0.");
        } else if (number < 0) {
            System.out.println("This is a negative number.");
        } else {
            System.out.println("This is a positive number.");
        }
    }
}
