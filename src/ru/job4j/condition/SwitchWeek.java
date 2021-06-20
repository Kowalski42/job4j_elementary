package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        switch (day) {
            case 1 :
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4 :
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Ошибка";
        }
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(10));
    }
}
