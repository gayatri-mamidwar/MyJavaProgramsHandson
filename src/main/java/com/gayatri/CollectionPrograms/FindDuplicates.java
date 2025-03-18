package com.gayatri.CollectionPrograms;

import java.util.*;

public class FindDuplicates {                       //using Hashset. TRICKY................
    public static void main(String[] args) {

        //primitive d.t wont work with collection. use Wrapper classes
        int[] arr = {10,20,30,40,30,20,5};                  //o/p- [30,20]          hs = 10,20,30,40,5
        List<Integer> ans = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        Set<Integer> duplicatesSet = new LinkedHashSet<>();

        for(int num : arr){
            if (set.contains(num)) {    // If num is already in set, it's a duplicate
                duplicatesSet.add(num);
            } else {
                set.add(num);           // Otherwise, add it to set
            }
        }

        System.out.println("duplicate ele = "+duplicatesSet);

    }
}
