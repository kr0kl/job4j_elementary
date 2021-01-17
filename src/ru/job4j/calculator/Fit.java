package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manHeight) {
        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(short womanHeight) {
        return (womanHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 187 is " + man);
        short womanHeight = 187;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman 187 is " + woman);

    }

}
