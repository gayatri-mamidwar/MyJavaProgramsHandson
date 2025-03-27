package com.gayatri.CollectionPrograms.JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortDescOrder {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Mango", "Banana", "Cherry"));
        System.out.println("list = " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decreasing list = " + list);

        System.out.println("----------------------------------------------------");
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,30,50,70,20));
        System.out.println("list = " + arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("Decreasing list = " + arr);

    }
}
