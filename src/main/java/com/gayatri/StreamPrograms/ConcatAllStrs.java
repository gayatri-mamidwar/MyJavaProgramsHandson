package com.gayatri.StreamPrograms;

/*
Java stream prog to concatenate all strings in a list into a single string
 */

import java.util.Arrays;
import java.util.List;

public class ConcatAllStrs {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Stream", "Api", "Is", "Powerful");

        String concatenated = words.stream()
                .reduce("", (s1, s2) -> s1 +""+ s2).trim();

        //For spacing between words use " "
        //.reduce("", (s1, s2) -> s1 + " " + s2)

        System.out.println(concatenated);
    }
}
