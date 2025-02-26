package com.gayatri.StringProblems;

public class TotalWordCount {
    public static void main(String[] args) {

        String s = " How are you ";
        s = s.trim();
        int spaceCount = 0;

//        String[] arr = s.split(" ");
        for(int i=0; i<s.length(); i++){                //split logic
            if(s.charAt(i) == ' '){
                spaceCount++;
            }
        }

        String[] arr = new String[spaceCount + 1];
        System.out.println("total words = "+arr.length);
    }
}
