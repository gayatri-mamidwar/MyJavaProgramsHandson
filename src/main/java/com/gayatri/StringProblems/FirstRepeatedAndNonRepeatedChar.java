package com.gayatri.StringProblems;

import java.util.HashMap;

public class FirstRepeatedAndNonRepeatedChar {
    public static void main(String[] args) {

        String s = "JavaConceptOfTheDay";
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();

        //updtae hm with char freq
        for(int i=0; i<n; i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(hm);

        //find 1st non-repeated char
        for (int i=0; i<n; i++){
            if(hm.get(s.charAt(i)) == 1){
                System.out.println("1st Non-repeated char in '" + s + "' is = " + s.charAt(i));
                break;
            }
        }

        //find 1st repeated char
        for (int i=0; i<n; i++){
            if(hm.get(s.charAt(i)) > 1){
                System.out.println("1st repeated char in '" + s + "' is = " + s.charAt(i));
                break;
            }
        }
    }
}
