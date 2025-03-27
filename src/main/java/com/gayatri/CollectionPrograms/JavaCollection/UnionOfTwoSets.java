package com.gayatri.CollectionPrograms.JavaCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* Union of Two Sets -
Find the union of two sets using addAll().
 */
public class UnionOfTwoSets {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println("s1 : "+s1);
        Set<Integer> s2 = new HashSet<>(Arrays.asList(5,6,7,8,9));
        System.out.println("s2 : "+s2);
        s1.addAll(s2);
        System.out.println("Union : " + s1);
    }
}
