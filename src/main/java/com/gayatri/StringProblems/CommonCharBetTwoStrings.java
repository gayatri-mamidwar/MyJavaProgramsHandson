package com.gayatri.StringProblems;

//Java program to print common characters between two strings in alphabetical order.

import java.util.*;

public class CommonCharBetTwoStrings {
    public static void main(String[] args) {

        String s1 = "gayatri";
        String s2 = "pritam";

        System.out.println("String1 = " + s1);
        System.out.println("String2 = " + s2);

        Set<Character> hs1 = new TreeSet<>();
        Set<Character> hs2 = new TreeSet<>();

        for(int i=0; i<s1.length(); i++){
            hs1.add(s1.charAt(i));
        }
        System.out.println("set1 = " + hs1);

        for(int i=0; i<s2.length(); i++){
            hs2.add(s2.charAt(i));
        }
        System.out.println("set2 = " + hs2);

        //using retainAll() of set, which return common ele
        hs1.retainAll(hs2);
        System.out.println(hs1);

        List<Character> list = new ArrayList<>();

        // Used an enhanced for loop to iterate over hs1 since HashSet does not support indexing. simple for loop doesnt work here
//        for(char ch : hs1){
//            if(hs2.contains(ch)){
//                list.add(ch);
//            }
//        }

        System.out.println(list);
    }
}
