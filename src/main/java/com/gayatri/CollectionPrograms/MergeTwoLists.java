package com.gayatri.CollectionPrograms;

/* Merge Two Lists -
Merge two lists (e.g., ArrayLists) while removing duplicates or sorting them.
ex- Al1 =[10,30,40,20]         Al2 = [20,35,50]                o/p-[10,20,30,35,40,50]
 */

import java.util.*;

public class MergeTwoLists {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(Arrays.asList(10,30,40,20));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(20,35,50));

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        Set<Integer> ans = new TreeSet<>(l1);
        for(Integer ele : l2) {
            ans.add(ele);
        }

        System.out.println("after merge & sort : " +ans);
    }
}
