package com.bridgelabz.Program;

public class ExtendsMaxMethodPassingThreeParameterUC4 <E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] extraParamaters;

    public ExtendsMaxMethodPassingThreeParameterUC4(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.extraParamaters = extraParamaters;
    }

    public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue,E... extraParamaters) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        if (extraParamaters.length != 0) {
            for (E extraParamater : extraParamaters) {
                if (extraParamater.compareTo(max) > 0) {
                    max = extraParamater;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new ExtendsMaxMethodPassingThreeParameterUC4(1.1f, 2.2f, 3.3f, 4.4f).getMax());
        System.out.println(new ExtendsMaxMethodPassingThreeParameterUC4(10, 20, 30, 40).getMax());
        System.out.println(new ExtendsMaxMethodPassingThreeParameterUC4("Deepak", "Aryan", "Rahul", "Nitish").getMax());
    }


    public <E extends Comparable<E>> E getMax() {
        E max = (E) getMax(firstValue, secondValue, thirdValue, extraParamaters);
        return max;
    }
}
