package com.gayatri.CollectionPrograms.JavaCollection;

import java.util.*;

/* Remove Duplicates from a List -
Remove duplicate elements from a list while maintaining the original order (using LinkedHashSet).
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,10,5,40));

        //LinkedHashSet -> for maintaining insertion order
        Set<Integer> ans = new LinkedHashSet<>(al);

        //HashSet -> doesn't gurantee insertion order
//        Set<Integer> ans = new HashSet<>(al);

        //TreeSet -> returns key sorted order
        //Set<Integer> ans = new TreeSet<>(al);

        System.out.println("After removing duplicates : "+ans);
    }
}
