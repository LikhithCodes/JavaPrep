package com.likki.codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) throws Exception {
        //Input -> List of (ab bc ca) Output -> a=2.b=2,c=2
        List<String> sampleList = new ArrayList<>();
        sampleList.add("ab");
        sampleList.add("bc");
        sampleList.add("ac");
        Map<Character, Integer> outputMap = new HashMap<>();
        for (int i = 0; i < sampleList.size(); i++) {
            char[] charArr = sampleList.get(i).toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                if (!outputMap.containsKey(charArr[j])) {
                    outputMap.put(charArr[j], 1);
                } else {
                    outputMap.put(charArr[j], outputMap.get(charArr[j]) + 1);
                }
            }

        }
        System.out.println("Output" + outputMap.toString());

        //Alternative approach
        List<String> inputList = List.of("ab", "bc", "ca");
        System.out.println(inputList.stream().flatMap(a -> a.chars().mapToObj(b -> String.valueOf((char) b))).collect(Collectors.groupingBy(a -> a, Collectors.counting())));

       //Bruteforce approach
        List<String> list1 = List.of("ab","bc","ca");
        Map<String, Integer> outputMap1 = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) { // To iterate the entire list ab
            String[] listArr = list1.get(i).split(""); //a,b
            for (int j = 0; j < listArr.length; j++) {
                if (outputMap1.containsKey(listArr[j])) {
                    outputMap1.put(listArr[j], outputMap1.get(listArr[j]) + 1);
                } else {
                    outputMap1.put(listArr[j], 1);
                }
            }
        }
        System.out.println(outputMap1.toString());


    }
}
