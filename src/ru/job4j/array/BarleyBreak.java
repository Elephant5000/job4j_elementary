package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array1 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] array2 = new int[3][3];
        int index = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                index++;
                array2[i][j] = index;
            }
        }
    }
}
