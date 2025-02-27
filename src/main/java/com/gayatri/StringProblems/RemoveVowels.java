package com.gayatri.StringProblems;

public class RemoveVowels {
    public static void main(String[] args) {

        String s = "gayatri";
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' ){
                sb.append(ch);
            }
        }

        System.out.println("after removing vowels from '" + s + "' is = " + sb);
    }
}
