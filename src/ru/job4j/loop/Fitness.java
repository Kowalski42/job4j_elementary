package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        final int K_IVAN = 3;
        final int K_NIK = 2;
        int month = 0;
        while (ivan <= nik) {
            ivan *= K_IVAN;
            nik *= K_NIK;
            month++;
        }
        return month;
    }
}
