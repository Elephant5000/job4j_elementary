package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height-100)*1.15; //Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height-110)*1.15; //Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
        return rsl;
    }

    public static void main(String[] args) {
        double heightMan = 185;
        double heightWoman = 165;

        double man = Fit.manWeight(heightMan);
        System.out.println("Man "  + heightMan +  " is " +  man);

        double women = Fit.womanWeight(heightWoman);
        System.out.println("Woman " +  heightWoman +  " is " +  women);

    }

}