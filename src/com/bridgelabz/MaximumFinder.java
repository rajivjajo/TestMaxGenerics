package com.bridgelabz;
public class MaximumFinder<T extends Comparable<T>> {
    private T num1;
    private T num2;
    private T num3;

    public MaximumFinder(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public T testMaximum() {
        return findMaximum(num1, num2, num3);
    }

    public static <T extends Comparable<T>> T findMaximum(T num1, T num2, T num3) {
        T max = num1;
        max = max.compareTo(num2) > 0 ? max : num2;
        max = max.compareTo(num3) > 0 ? max : num3;
        return max;
    }

    public static void main(String[] args) {
        MaximumFinder<Integer> intFinder = new MaximumFinder<>(5, 10, 3);
        System.out.println("Max int: " + intFinder.testMaximum());
        MaximumFinder<Float> floatFinder = new MaximumFinder<>(5.5f, 10.2f, 3.8f);
        System.out.println("Max float: " + floatFinder.testMaximum());
        MaximumFinder<String> stringFinder = new MaximumFinder<>("Apple", "Peach", "Banana");
        System.out.println("Max string: " + stringFinder.testMaximum());
    }
}

