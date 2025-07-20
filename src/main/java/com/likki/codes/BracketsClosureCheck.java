package com.likki.codes;

public class BracketsClosureCheck {
    public static void main(String[] args) {
        //Write a program to check whether all brackets are closed or not, in a given string.
        String input = "({frs(g)s})";
        int countOpen = 0;
        int countClosed = 0;
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{') {
                countOpen++;
            } else if (c == ')' || c == '}') {
                countClosed++;
            }
        }
        if (countOpen == countClosed) {
            System.out.println("All brackets are closed");
        } else System.out.println("All brackets are not closed");
    }
}
