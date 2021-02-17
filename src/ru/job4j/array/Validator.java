package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int sum = 0;
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                sum++;
            }
        }
        if (sum >= data.length / 2) {
            result = false;
        }
        return result;
    }
}
