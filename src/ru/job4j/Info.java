package ru.job4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Info {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("dd.MM.YYYY").format(new Date()));
    }
}
