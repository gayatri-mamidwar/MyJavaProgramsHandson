package com.gayatri.CollectionPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArr {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        HashSet<Integer> hs1 = new HashSet<>();
        for(int ele : arr1){
            hs1.add(ele);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for(int ele : arr2){
            if(hs1.contains(ele)){
                intersectionSet.add(ele);
            }
        }
        System.out.println("Intersection arr = "+intersectionSet);

    }
}
