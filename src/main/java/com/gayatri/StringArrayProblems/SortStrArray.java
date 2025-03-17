package com.gayatri.StringArrayProblems;

import java.util.Arrays;

public class SortStrArray {
    public static void main(String[] args) {

        String[] strarr = {"Gayatri", "Aarti", "Pooja", "Pooja", "Nandini"};

        //Using sort()
        Arrays.sort(strarr);
        System.out.println("Using inbuild sort : " + Arrays.toString(strarr));

        //Without using inbuild sort. selection sort
        for(int i=0; i< strarr.length; i++){
            int minIndex = i;

            for(int j=i+1; j< strarr.length; j++){
                if(strarr[minIndex].compareTo(strarr[j]) > 0){
                    String temp = strarr[j];
                    strarr[j] = strarr[minIndex];
                    strarr[minIndex] = temp;
                }
            }
        }
        System.out.println("After sort : " + Arrays.toString(strarr));

    }
}
