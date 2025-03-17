package com.gayatri.StringArrayProblems;

import java.util.Arrays;

public class StringArrRev {
    public static void main(String[] args) {

        String[] arr = {"abc", "xyz", "mno"};
        String[] ans = new String[arr.length];

        int count = 0;
        for(int i= arr.length-1; i>=0; i--){
            String str = arr[i];
            StringBuilder sb = new StringBuilder();

            for(int j=str.length()-1; j>=0; j--) {
                sb.append(str.charAt(j));
            }
            ans[count] = sb.toString();
            count++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
