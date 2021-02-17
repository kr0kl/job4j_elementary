package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int temp;
        for (int i = 0; i < data[src].length; i++) {
            temp = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = temp;
        }
    }
}
