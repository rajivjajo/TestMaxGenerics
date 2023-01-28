package com.bridgelabz;
public class MaxNumber <T extends Comparable>{
    public T findMax(T num1, T num2, T num3) {
        T max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Test max Number using Generics!");
        MaxNumber<Float> max= new MaxNumber<>();
        System.out.println("Maximum number: " + max.findMax(5.0f, 3.0f, 1.0f));
        System.out.println("Maximum number: " + max.findMax(4.0f, 20f, 5.0f));
        System.out.println("Maximum number: " + max.findMax(6.f, 4.0f, 30.f));
    }
}
