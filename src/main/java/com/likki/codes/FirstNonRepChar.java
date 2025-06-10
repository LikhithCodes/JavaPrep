package com.likki.codes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepChar {
    public static void main(String[] args) {
        //Find first non repetitive character
        String input = "engineering";
        Map<Character,Long> output = input.chars().mapToObj(n -> (char) n).collect(Collectors.groupingBy(o->o, LinkedHashMap::new, Collectors.counting()));
        Optional<Map.Entry<Character, Long>> out = output.entrySet().stream().filter(entry -> entry.getValue() ==1).findFirst();
        System.out.println(out.toString());
    }
}
