package com.likki.codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveZeroesOrderPreserve {
    public static void main(String[] args) {
        Integer[] input = {0, 10, 3, 0, 9, 3, 0, 7, 0, 9};
        Set<Integer> output = new LinkedHashSet<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                output.add(input[i]);
            }
        }
        System.out.println(output.toString());
    }
}
