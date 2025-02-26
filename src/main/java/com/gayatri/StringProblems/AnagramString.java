package com.gayatri.StringProblems;

import java.util.Scanner;

/* 3 diff way->
1) cal sum of chars of s1 & check is it same for s2. if yes means anagram
2) use hashmap for 1 string & check whether string 2 having same freq of char
3) sort both strings & compare char by char
 */

public class AnagramString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings : ");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean ans = isAnagram(s1, s2);
        System.out.println(ans);

    }

    private static boolean isAnagram(String s1, String s2) {
        int n = s1.length();
        int s1sum = 0, s2sum=0;

        if(s1.length() != s2.length()){
            return false;
        } else{
            for (int i=0; i<n; i++){
                s1sum += (int) s1.charAt(i);        //here type casting is not necessary bcz implicit casting is happening char->int
                s2sum += (int) s2.charAt(i);
            }
            if(s1sum != s2sum){
                return false;
            }
        }
        return true;
    }
}


/* Mistake dont create scanner obj twice.Every time you create a new Scanner object,
    it expects fresh input, which can lead to unexpected behavior. just use single scanner obj-
    Avoid->
        String s1 = new Scanner(System.in).next();
        String s2 = new Scanner(System.in).next();
        */