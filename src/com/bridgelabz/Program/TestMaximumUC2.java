package com.bridgelabz.Program;

public class TestMaximumUC2 {
    public static <D extends Comparable<D>> D maximum(D x, D y, D z) {
        D max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is " + maximum(1.1f,2.2f,3.3f));
    }
}
