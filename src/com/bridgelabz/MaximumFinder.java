package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumFinder<T extends Comparable<T>> {
    private List<T> numbers;

    public MaximumFinder(T... numbers) {
        this.numbers = Arrays.asList(numbers);
    }
    public T testMaximum() {
        return findMaximum(numbers);
    }
    public static <T extends Comparable<T>> T findMaximum(List<T> numbers) {
       Collections.sort(numbers);
        return numbers.get(numbers.size() - 1);
    }
    public static void main(String[] args) {
        MaximumFinder<Integer> intFinder = new MaximumFinder<>(5, 10, 3, 15, 20);
        System.out.println("Max int: " + intFinder.testMaximum());
        MaximumFinder<Float> floatFinder = new MaximumFinder<>(5.5f, 10.2f, 3.8f, 2.0f, 8.9f);
        System.out.println("Max float: " + floatFinder.testMaximum());
        MaximumFinder<String> stringFinder = new MaximumFinder<>("Apple", "Peach", "Banana", "Cherry", "Grapes");
        System.out.println("Max string: " + stringFinder.testMaximum());
    }

}

