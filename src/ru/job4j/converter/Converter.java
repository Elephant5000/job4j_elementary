package ru.job4j.converter;

/*
* Converter
*
* @author Pavel Ustyuzhanin
 */
public class Converter {

    /*
    * rubTousd
    * @param value - value.
    * @return conversion from rubles to dollars
    */
    public static int rubTousd(int value) {
        int rsl = value / 75;
        return rsl;
    }

    /*
     * rubToeur
     * @param value - value.
     * @return conversion from rubles to euro
     */
    public static int rubToeur(int value) {
        int rsl = value / 85;
        return rsl;
    }

    /*
     * main
     * @param args - args.
     */
    public static void main(String[] args) {
        int in = 170;
        int expected = 2;
        int out = rubToeur(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles  are " + out + ". Результат теста : " + passed);
    }
}
