package com.gayatri.StringArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class StringExistance {
    public static void main(String[] args) {

        String[] strarr = {"Gayatri", "Aarti", "Pooja", "Pooja", "Nandini"};
        System.out.println("Arr : " + Arrays.toString(strarr));

        System.out.println("enter string : ");
        String sc = new Scanner(System.in).next();

        for (int i=0; i< strarr.length; i++){
            if(sc.equals(strarr[i])){
                System.out.println("exist");
                return;
            }
        }

        System.out.println("not exist");
    }
}
