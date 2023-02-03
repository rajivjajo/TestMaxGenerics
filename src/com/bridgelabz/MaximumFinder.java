package com.bridgelabz;
public class MaximumFinder<T extends Comparable>{
    public static <T extends Comparable<T>> T findMaximum(T num1, T num2, T num3) {
        T max = num1;
        max = max.compareTo(num2) > 0 ? max : num2;
        max = max.compareTo(num3) > 0 ? max : num3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max int: " + MaximumFinder.findMaximum(5, 10, 3));
        System.out.println("Max float: " + MaximumFinder.findMaximum(5.5f, 10.2f, 3.8f));
        System.out.println("Max string: " + MaximumFinder.findMaximum("Apple", "Peach", "Banana"));
    }
}
