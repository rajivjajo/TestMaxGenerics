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
        String s1 = "Apple";
        String s2 = "Peach";
        String s3 = "Banana";
        MaxNumber<String> max= new MaxNumber<>();
        System.out.println("Maximum number: " + max.findMax(s1,s2,s3));
        System.out.println("Maximum number: " + max.findMax(s2,s3,s1));
        System.out.println("Maximum number: " + max.findMax(s3,s2,s1));
    }
}
