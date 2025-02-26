package com.gayatri.StringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWords {
    public static void main(String[] args) {

        String s = "Good morning good evening Good";
        String[] strarr = s.split(" ");
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < strarr.length; i++) {
            hm.put(strarr[i], hm.getOrDefault(strarr[i], 0) + 1);
        }
        System.out.println(hm);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > 1)
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
