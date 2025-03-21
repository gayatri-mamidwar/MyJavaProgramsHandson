package com.gayatri.CollectionPrograms;

/* Find the Largest/Smallest Element in a List -
Find the largest or smallest element in a list
 using Collections.max() or Collections.min(), or by manually iterating through the list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMax {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,100));
        System.out.println("list = " + list);
        System.out.println("min ele : " + Collections.min(list));
        System.out.println("max ele : " + Collections.max(list));
    }
}
