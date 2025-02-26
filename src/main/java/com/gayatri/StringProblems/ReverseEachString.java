package com.gayatri.StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachString {
    public static void main(String[] args) {

//        System.out.println("Enter sentence : ");
//        String str = new Scanner(System.in).nextLine();
        String str = "Hellow World";
        reverseEachString(str);
    }

    private static void reverseEachString(String str) {
        String[] strarr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        /* using reverse()
        for(String str1 : strarr){
            StringBuilder sb = new StringBuilder(str1);
            System.out.print(sb.reverse() + " ");
        }
         */

        for (String s : strarr) {
            for (int i = s.length()-1; i >=0; i--) {
                sb.append(s.charAt(i));
                if(i == 0){
                    sb.append(" ");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
