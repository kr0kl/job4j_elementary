package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        boolean maximum = left > right;
        return maximum ? left : right;
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        int big = Max.max(33, 55);
        System.out.println(big);
    }
}
