package com.likki.codes;

import java.util.ArrayList;
import java.util.List;

public class ArraysExample {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 8, 12, 15, 21, 42, 49, 99};
        int[] arr2 = {5, 7, 10, 20, 51, 80, 91};
        //Output should have even and odd numbers in separate lists along with ascendig order
        int i = 0;
        int j = 0;
        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (arr1[i] % 2 == 0) {
                    listEven.add(arr1[i]);
                } else {
                    listOdd.add(arr1[i]);
                }
                i++;
            } else {
                if (arr2[j] % 2 == 0) {
                    listEven.add(arr2[j]);
                } else {
                    listOdd.add(arr2[j]);
                }
                j++;
            }


        }
        while (i < arr1.length) {

            if (arr1[i] % 2 == 0) {
                listEven.add(arr1[i]);
            } else {
                listOdd.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {

            if (arr2[j] % 2 == 0) {
                listEven.add(arr2[j]);
            } else {
                listOdd.add(arr2[j]);
            }
            j++;
        }
        System.out.println("Even : " + listEven + "\nOdd : " + listOdd);

    }
}
