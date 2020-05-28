package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] array2 = new int[3][3];
        int index = 0;
        for (int indexRow = 0; indexRow < array2.length; indexRow++) {
            for (int indexCell = 0; indexCell < array2.length; indexCell++) {
                index++;
                array2[indexRow][indexCell] = index;
            }
        }
    }
}
