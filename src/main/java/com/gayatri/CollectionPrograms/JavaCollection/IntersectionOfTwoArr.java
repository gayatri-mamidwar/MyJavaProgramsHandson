package com.gayatri.CollectionPrograms.JavaCollection;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArr {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        //Using retailAll()
        HashSet<Integer> hs1 = new HashSet<>();
        for(int ele : arr1){
            hs1.add(ele);
        }

        HashSet<Integer> hs2 = new HashSet<>();
        for(int ele : arr2){
            hs2.add(ele);
        }

        hs1.retainAll(hs2);
        System.out.println("Intersection arr = "+hs1);


        /* Without using retainAll()
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
         */
    }
}
