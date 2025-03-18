package com.gayatri.CollectionPrograms.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "aabcddefgghijj";       //o/p- c

        //here, LinkedHashMap is required bcz insertion order matters. So, HashMap is also working
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] chararr = s.toCharArray();

        for(int i=0; i< chararr.length; i++){
            map.put(chararr[i], map.getOrDefault(chararr[i], 0) + 1);
        }

        System.out.println("map = "+map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First repeated Char = " + entry.getKey());
                return;
            }
        }

        System.out.println("First Repeated Char not present..");
    }
}
