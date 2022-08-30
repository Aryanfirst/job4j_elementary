package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int big  = Max.max(12, 29);
        System.out.println(big);
        int max = Max.max(33, 45);
        System.out.println(max);
    }
}
