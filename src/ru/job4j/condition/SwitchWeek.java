package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String result = "";
        switch (day) {
            case 1 :
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4 :
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            default:
                result = "Ошибка";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(10));
    }
}
