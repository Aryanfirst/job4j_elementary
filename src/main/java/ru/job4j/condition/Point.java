package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 4, 4, 0);
        System.out.println("result (4, 4) to (4, 0) " + result);
        double result1 = Point.distance(3, 2, 6, 8);
        System.out.println("result (3, 2) to (6, 8) " + result1);
        double result2 = Point.distance(11, 4, 7, 13);
        System.out.println("result (11, 4) to (7, 13) " + result2);
    }
}
