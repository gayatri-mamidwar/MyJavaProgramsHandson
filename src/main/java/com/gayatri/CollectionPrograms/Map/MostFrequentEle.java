package com.gayatri.CollectionPrograms.Map;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEle {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 4, 1, 3, 3, 5};                //o/p- 3
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("map = "+hm);

        int FreqEleFreq = 0;
        int FreqEle = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() > FreqEleFreq){
                FreqEleFreq = entry.getValue();
                FreqEle = entry.getKey();
            }
        }

        System.out.println("Most frequent Ele = "+ FreqEle);
    }
}
