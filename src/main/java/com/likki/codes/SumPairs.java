package com.likki.codes;

import java.util.HashSet;
import java.util.Set;

public class SumPairs {
    public static void main(String[] args) throws Exception {
        //Input : int[] arr = {1,5,6,7,8,4,2}, k=9
        //Output : {1,8},{5,4},{7,2}
        int[] inputArr = {1,5,6,7,8,4,2};
        int sum = 9;
        Set<Integer> result = new HashSet<>();
        Set<String> resultFinal = new HashSet<>();
        for(int num : inputArr){
            int complement = sum - num;
            if(result.contains(complement)){
                int i = Math.min(complement, num);
                int j = Math.max(complement, num);
                String out = "{" + i + "," + j + "}";
                if(!resultFinal.contains(out)){
                    resultFinal.add(out);
                }
            }
            result.add(num);


        }
        System.out.println(resultFinal);
    }
}
