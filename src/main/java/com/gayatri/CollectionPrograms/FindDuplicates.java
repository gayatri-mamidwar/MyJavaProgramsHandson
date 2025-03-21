package com.gayatri.CollectionPrograms;

import java.util.*;

/* Find Duplicates in a List-
Identify duplicate elements in a List.
This can be achieved using HashSet to store already encountered elements and checking for duplicates as you iterate.
 */
public class FindDuplicates {                                   //using Hashset. TRICKY................
    public static void main(String[] args) {

        //primitive d.t wont work with collection. use Wrapper classes
        int[] arr = {10,20,30,40,30,20,5,30};                  //o/p- [30,20]          hs = 10,20,30,40,5

        Set<Integer> seenSet = new HashSet<>();
        Set<Integer> duplicatesSet = new LinkedHashSet<>();     //to print duplicates only once

        //List<Integer> duplicates = new ArrayList<>();  //to print duplicates as many time it occurs.

        for(int num : arr){
            if (seenSet.contains(num)) {    // If num is already in set, it's a duplicate
                duplicatesSet.add(num);
            } else {
                seenSet.add(num);           // Otherwise, add it to set
            }
        }

        System.out.println("duplicate ele = "+duplicatesSet);

    }
}
