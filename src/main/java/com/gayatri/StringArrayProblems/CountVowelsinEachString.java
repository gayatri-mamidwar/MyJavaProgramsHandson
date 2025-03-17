package com.gayatri.StringArrayProblems;

public class CountVowelsinEachString {
    public static void main(String[] args) {

        String[] strarr = {"gayatri", "pritam", "yogi", "pooja"};

        for(int i=0; i< strarr.length; i++){
            String s = strarr[i];
            int vowelCount = 0;

            for(int j=0; j<s.length(); j++){
                char ch = s.charAt(j);

                if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u'||
                    ch == 'A' || ch == 'E' || ch =='I' || ch=='O' || ch=='U'){
                    vowelCount++;
                }
            }

            System.out.println(s + " vowelcount =  " + vowelCount);
        }

    }
}
