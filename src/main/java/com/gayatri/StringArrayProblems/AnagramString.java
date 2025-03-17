package com.gayatri.StringArrayProblems;

import java.util.Arrays;
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
        int anagram = isAnagram(s1, s2);
        boolean ans = anagram == 0 ? true : false;          //if same returns 0
        System.out.println(ans);

    }

    private static int isAnagram(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.compare(str1, str2);
    }
}


/* Mistake dont create scanner obj twice.Every time you create a new Scanner object,
    it expects fresh input, which can lead to unexpected behavior. just use single scanner obj-
    Avoid->
        String s1 = new Scanner(System.in).next();
        String s2 = new Scanner(System.in).next();
*/