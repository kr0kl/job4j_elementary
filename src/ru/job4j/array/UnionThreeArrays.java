package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        int index = 0;
        result[index] = left[0];
        index++;
        for (int i = 0; i < middle.length; i++) {
            if (i % 2 == 1) {
                result[i + 1] = middle[i];
                index++;
            }
        }
        for (int j = 0; j < right.length; j++) {
            if (j % 2 == 0) {
                result[j + 1] = right[j];
                index++;
            }
        }
        result[index] = left[left.length - 1];
        index++;
        return result;
    }
}
