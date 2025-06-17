package com.likki.codes;

public class StringsEquality {
    public static boolean isEqual(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        boolean result = false;
        if (s1Arr.length == s2Arr.length) {
            for (int i = 0; i <= s1Arr.length - 1; i++) {
                if (s1Arr[i] == s2Arr[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        boolean output = isEqual(s1, s2);
        System.out.println("Given strings are equal? : " + output);
    }
}
