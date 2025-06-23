package com.likki.codes;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondHighest = getSecondHighest(arr);
        System.out.println(secondHighest);
    }

    private static int getSecondHighest(int[] arr) {
        return Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }
}
