package com.gayatri.StringArrayProblems;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPref {
    public static void main(String[] args) {

        String[] strarr = {"flower", "flow", "flood"};
        System.out.println("Original Array : " + Arrays.toString(strarr));

        /* Optional if u want to sort be str length & compare shortest string length
        Arrays.sort(strarr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Array after sort by length : " + Arrays.toString(strarr));
         */

        for (int i = 0; i < strarr[0].length(); i++) {
            char ch = strarr[0].charAt(i);

            for (String s : strarr) {
                if (i >= s.length() || s.charAt(i) != ch) {
                    System.out.println(strarr[0].substring(0, i));
                    return;
                }
            }
        }
        System.out.println(strarr[0]);

    }
}
