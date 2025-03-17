package com.gayatri.StringArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateStr {
    public static void main(String[] args) {

        String[] strarr = {"Gayatri", "Aarti", "Pooja", "Pooja", "Nandini"};
        System.out.println("Original arr = " + Arrays.toString(strarr));

        //Using Hashset (store unique ele)
        HashSet<String> hs = new HashSet<>(List.of(strarr));
        System.out.println("Ans using hashset : " + hs);

        List<String> ans = new ArrayList<>();
        Arrays.sort(strarr);

        for (int i = 0; i < strarr.length; i++) {
            String s = strarr[i];

            // If the current string is not equal to the next one, add it to ans
            if (i + 1 < strarr.length && !s.equals(strarr[i + 1])) {
                ans.add(s);
            }

            // Add the last element (It is missed in the above condition)
            if (i == strarr.length - 1) {
                ans.add(s);
            }
        }

        System.out.println("Ans : " + ans);

    }
}
