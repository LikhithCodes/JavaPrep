package com.likki.codes;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        //Type 1
        String[] input = {"JAVA","IS","JAVA","HI","TEST","IS"};
        Map<String,Long> output = Arrays.stream(input).collect(Collectors.groupingBy(n->n, Collectors.counting()));
        System.out.println(output.toString());
        //Type 2
        String inputStr = "JAVA IS JAVA HI TEST IS";
        String[] inputConv = inputStr.split(" ");
        Map<String,Long> outputConv = Arrays.stream(inputConv).collect(Collectors.groupingBy(n->n, Collectors.counting()));
        System.out.println(outputConv.toString());
    }
}
