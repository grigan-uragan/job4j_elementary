package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nikola) {
        int month = 0;
        while (ivan < nikola) {
            ivan = ivan * 3;
            nikola = nikola * 2;
            month++;
        }
        return month;
    }
}
