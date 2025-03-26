package com.gayatri.StreamPrograms;

import java.util.*;

//TO find nth largest just chng skip value put n-1 inside it. ex-4th largest inside skip(3)
public class ThirdLargestEle {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(20,60,40,50,100,150,200));

        Integer nthLargest = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(0);

        System.out.println("Third largest = " + nthLargest);
    }
}
