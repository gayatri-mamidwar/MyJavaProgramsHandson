package com.gayatri.StringArrayProblems;

import java.util.HashMap;

public class CountStringFreq {
    public static void main(String[] args) {

        String[] strarr = {"good", "good", "bad", "honest"};

        //Return String with frequency
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i< strarr.length; i++){
            map.put(strarr[i], map.getOrDefault(strarr[i], 0) + 1);
        }

        System.out.println(map);
        System.out.println("---------------------");

        //Return unique strings
        for(int i=0; i< strarr.length; i++){
            if(map.get(strarr[i]) == 1){
                System.out.print(strarr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("---------------------");

        //Check if a String Exists in the Array  let, s="honest"
        String s = "honest";
        boolean ans = false;
        for(int i=0; i< strarr.length; i++){
            if(s == strarr[i]){
                ans = true;
            }
        }
        System.out.println(ans);

    }
}
