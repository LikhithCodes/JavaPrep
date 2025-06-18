package com.likki.codes;

import java.util.Arrays;
import java.util.List;

public class SquareSumDouble {
    public static void main(String[] args) {
        List<Double> input = Arrays.asList(29.11, 19.23, null, 32.1, 89.11, 444.5);
        //Need to square and the sum the input numbers that are ending with 9, before decimal point
        Double out = input.stream().filter(n -> n != null).filter(i -> (long) Math.floor(i) % 10 == 9).mapToDouble(num -> num * num).sum();
        System.out.println(out);
    }
}
