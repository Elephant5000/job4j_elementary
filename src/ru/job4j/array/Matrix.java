package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int indexRow = 0; indexRow < size; indexRow++) {
            for (int indexCell = 0; indexCell < size; indexCell++) {
                table[indexRow][indexCell] = (indexRow + 1) * (indexCell + 1);
            }
        }
        return table;
    }
}
