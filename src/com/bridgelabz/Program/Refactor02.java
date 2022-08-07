package com.bridgelabz.Program;

public class Refactor02<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;

    public Refactor02(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Refactor02(1.1f,2.2f,3.3f).getMax());
        System.out.println(new Refactor02(10,20,30).getMax());
        System.out.println(new Refactor02("Deepak", "Aryan", "Kumar").getMax());
    }

    public <E extends Comparable<E>> E getMax() {
        E max = (E) getMax(firstValue, secondValue, thirdValue);
        return max;
    }
}
