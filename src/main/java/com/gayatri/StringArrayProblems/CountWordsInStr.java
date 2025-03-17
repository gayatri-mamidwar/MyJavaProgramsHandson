package com.gayatri.StringArrayProblems;

import java.util.Arrays;

public class CountWordsInStr {
    public static void main(String[] args) {

        String[] strarr = {"Gayatri Mamid ", "Aarti", "Pooja mdr xyz"};
        System.out.println("Arr : " + Arrays.toString(strarr));

        for (int i=0; i< strarr.length; i++){
            String s = strarr[i];
            int wordCount = 0;

            String[] totalwords = s.trim().split(" ");
            wordCount = totalwords.length;

            System.out.println(strarr[i] + " = " + wordCount);

        }
    }
}
