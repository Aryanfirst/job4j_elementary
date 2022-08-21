package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pper = (a + b + c) / 2;
        double a1 = pper - a;
        double b1 = pper - b;
        double c1 = pper - c;
        double p1 = pper * a1 * b1 * c1;
        double square = Math.sqrt(p1);
        return square;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
