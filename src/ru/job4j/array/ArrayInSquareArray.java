package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int intResult = (int) Math.ceil(Math.sqrt(array.length));
        int indexone = 0;
        int[][] result = new int[intResult][intResult];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (indexone < array.length) {
                    result[i][j] = array[indexone++];
                }
            }
        }
        return result;
    }
}
