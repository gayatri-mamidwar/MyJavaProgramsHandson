package com.gayatri.StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMinNumbers {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(20,30,5,100));

        System.out.println("list = "+list);
        int minEle = list.stream()
                .min(Integer::compareTo).orElseThrow();

        int maxEle = list.stream()
                .max(Integer::compareTo).orElseThrow();

        System.out.println("min = " + minEle + " , " + "max = "+ maxEle);
    }
}
