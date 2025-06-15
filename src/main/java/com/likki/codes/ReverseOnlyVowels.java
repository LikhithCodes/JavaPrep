package com.likki.codes;

public class ReverseOnlyVowels {
    public static String reverseVowels(String input) {
        char[] inputArr = input.toCharArray();
        int start = 0;
        int end = inputArr.length - 1;
        while (start < end) {
            if (!isCharVowel(inputArr[start])) {
                start++;
            } else if (!isCharVowel(inputArr[end])) {
                end--;
            } else {
                char temp = inputArr[start];
                inputArr[start] = inputArr[end];
                inputArr[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(inputArr);
    }

    private static boolean isCharVowel(char c) {
        if (c == 'a' || c == 'e' | c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' | c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String input = "hello";
        String output = reverseVowels(input);
        System.out.println(output);
    }

}
