package com.gayatri.StringProblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFreqChar {
    public static void main(String[] args) {

        System.out.println("Enter a string : ");
        String str = new Scanner(System.in).next();
        String ans = maxFreqChar(str);                    //instead of 'char' d.t use string d.t
        System.out.println("Characters with max frequency: " + ans);
    }

    private static String maxFreqChar(String str) {
        Map<Character, Integer> hm = new LinkedHashMap<>();     //to maintain input char order

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character Frequency Map: " +hm);

//        String ans = ' ';
        StringBuilder res = new StringBuilder();
        int maxfreq = 0;

        // Find the maximum frequency
        for(int freq : hm.values()){
            maxfreq = Math.max(freq, maxfreq);
        }


        // Collect all characters with the maximum frequency
        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() == maxfreq){
                res.append(entry.getKey()).append(',');
            }
        }

        //remove trailing(last) comma
        if(res.length() > 0){
            res.setLength(res.length() - 1);
        }

        return res.toString();
    }
}
