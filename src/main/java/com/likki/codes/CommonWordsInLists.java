package com.likki.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonWordsInLists {
    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("Hi","is","common","word","is");
        List<String> inputList2 = Arrays.asList("not","is","uncommon","word","is");
        //Get common words in a list using streams
        List<String> output = inputList1.stream().filter(inputList2::contains).distinct().collect(Collectors.toList());
        System.out.println(output.toString());

    }
}
