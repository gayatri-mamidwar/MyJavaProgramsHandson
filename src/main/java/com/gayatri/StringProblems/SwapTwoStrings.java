package com.gayatri.StringProblems;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String s1 = "Helloooo";
        String s2 = "byeeee";

        System.out.println("before swap = " + s1 + " " + s2);

        /* using temp
        String temp = s1;
        s1= s2;
        s2 = temp;
        */

        //Without using temp
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length(), s1.length());
        System.out.println(s1 + " " + s2);
    }
}
