package com.gayatri.StringProblems;

import java.util.HashMap;
import java.util.Scanner;

/* ex- "Hello"       o/p-{h-1, e-1, l-2, o-1}

trim() -> removes  whitespaces before and after the whole string. not the spaces bet the string
 to remove the spaces bet the string use -> replaceAll("\\s","")
 */

public class CharacterOccurances {
    public static void main(String[] args) {

        System.out.println("Enter a sentence : " );
        String str = new Scanner(System.in).nextLine().replaceAll("\\s","");

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        System.out.println(hm);
    }
}
