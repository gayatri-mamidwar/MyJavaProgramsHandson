package com.gayatri.StringArrayProblems;

import java.util.Arrays;

public class ConcatStringArr {
    public static void main(String[] args) {

        String[] strarr = {"Gayatri", "Aarti", "Pooja", "Pooja", "Nandini"};
        System.out.println("Arr : " + Arrays.toString(strarr));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i< strarr.length; i++){
            sb.append(strarr[i]);
        }

        System.out.println("Concatenated String = " + sb.toString());
    }
}
