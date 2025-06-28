package com.likki.codes;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1,8,4,5,9,4};
        Integer[] arr2 = {8,5,8,6,7,2,9};
        Integer[] output = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(output));
    }
}
