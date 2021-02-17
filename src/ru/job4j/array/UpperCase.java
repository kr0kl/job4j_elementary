package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] symbol = new char[string.length];
        int index = 0;
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                string[i] = Character.toUpperCase(string[i]);
                symbol[index] = string[i];
                index++;
            } else {
                symbol[index] = string[i];
                index++;
            }
        }
        return symbol;
    }
}
