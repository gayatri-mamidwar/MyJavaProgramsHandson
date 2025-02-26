package com.gayatri.StringProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter a string : ");
        String str = new Scanner(System.in).next();
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<=n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){     //just compare 1st char is same as last & so on
                return false;
            }
        }
        return true;
    }
}

/* 2nd way-
        char[] chararr = str.toCharArray();
        int n = chararr.length;

        for(int i=0; i<n/2; i++){
            char temp = chararr[i];
            chararr[i] = chararr[n-i-1];
            chararr[n-i-1] = temp;
        }

//        String str1 = Arrays.toString(chararr);               //it wont convert array to string properly.
        String str1 = new String(chararr);
        if(str.equals(str1)){
            System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }
         */