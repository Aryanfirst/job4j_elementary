package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslx = x2 - x1;
        double rsly = y2 - y1;
        double rslx2 = Math.pow(rslx, 2);
        double rsly2 = Math.pow(rsly, 2);
        double rsl = rslx2 + rsly2;
        rsl = Math.sqrt(rsl);
        return rsl;
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
