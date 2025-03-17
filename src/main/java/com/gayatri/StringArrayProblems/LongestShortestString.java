package com.gayatri.StringArrayProblems;

public class LongestShortestString {
    public static void main(String[] args) {

        String[] strarr = {"gayatri", "pritam", "yogi", "pooja"};
        int length = 0;
        String ans ="";

        //Longest String
        for(int i=0; i< strarr.length; i++){
            if(strarr[i].length() > length){
                length = strarr[i].length();
                ans = strarr[i];
            }
        }
        System.out.println("Longest String = " +ans);

        //Shortest String
        length = strarr[0].length();
         ans ="";

        //Longest String
        for(int i=1; i< strarr.length; i++){
            if(strarr[i].length() < length){
                length = strarr[i].length();
                ans = strarr[i];
            }
        }
        System.out.println("Shortest String = " +ans);

    }
}
