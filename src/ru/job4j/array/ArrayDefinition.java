package ru.job4j.array;

/*
* ArrayDefinition
*
* @author Pavel Ustyzhanin
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Эльза";
        names[1] = "Анна";
        names[2] = "Свен";
        names[3] = "Кристов";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
