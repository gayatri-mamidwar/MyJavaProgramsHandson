package com.gayatri.StringProblems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Enter a string : ");

        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>= 0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb);             //sb.toString() also works
    }
}
