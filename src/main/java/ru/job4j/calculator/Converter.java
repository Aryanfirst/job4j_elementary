package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float ruble = Converter.rubleToEuro(1);
        System.out.println("1 euro are " + ruble + " ruble.");
        ruble = Converter.rubleToDollar(1);
        System.out.println("1 dollar are " + ruble + " ruble.");
    }
}