package ru.job4j.array;

public class Definition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Mark Twen";
        names[1] = "Edgar Po";
        names[2] = "John Doe";
        names[3] = "Jack London";
        for (String str : names) {
            System.out.println(str);
        }
    }
}
