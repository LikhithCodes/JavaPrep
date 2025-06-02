package com.likki.codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class StripZeroesDups {
    public static void main(String[] args) {
        String input = "1100112220029974744008";
        char[] inputArr = input.toCharArray();
        Set<Character> out = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : inputArr) {
            if (ch != '0' && !out.contains(ch)) {
                out.add(ch);
            }
        }
        for (char c : out) {
            sb.append(c);
        }
        System.out.println(sb.toString());

    }
}
