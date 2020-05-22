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
        int rub = 2000;
        int usd = Converter.rubTousd(rub);
        System.out.println(rub + " рублей эквиватентны - " + usd + " долларам");
        int euro = Converter.rubToeur(rub);
        System.out.println(rub + " рублей эквиватентны - " + euro + " евро");

    }
}
