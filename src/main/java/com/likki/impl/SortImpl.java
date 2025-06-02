package com.likki.impl;

import com.likki.interfaces.SortInterface;

import java.util.Arrays;

public class SortImpl {
    public static void main(String[] args) {
        SortInterface ownInterface = arr -> Arrays.sort(arr);
        int[] intArr = { 1, 4, 3, 7, 5, 8 };
        ownInterface.sortArray(intArr);
        System.out.println("Sorted array is : " + Arrays.toString(intArr));
    }
}
