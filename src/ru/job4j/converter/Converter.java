package ru.job4j.converter;

public class Converter {
    public static int rubTousd(int value) {
        int rsl = value / 75;
        return rsl;
    }

    public static int rubToeur(int value) {
        int rsl = value / 85;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 170;
        int expected = 2;
        int out = rubToeur(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles  are " + out + ". Результат теста : " + passed);
    }
}
