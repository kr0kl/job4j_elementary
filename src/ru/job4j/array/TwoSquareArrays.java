package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[9];
        int index = 0;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (right[i][j] <= left[i][j]) {
                    result[index] = left[i][j];
                    index++;
                } else {
                    result[index] = right[i][j];
                    index++;
                }
            }

        }
        return result;
    }
}