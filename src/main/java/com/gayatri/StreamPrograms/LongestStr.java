package com.gayatri.StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//find longest string
public class LongestStr {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java","powerful","language","is","helloworld");

        //Using reduce()
        String longestStr = list.stream()
                .reduce( (s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .orElse(null);

        String smallestStr = list.stream()
                .reduce( (s1, s2) -> s1.length() < s2.length() ? s1 : s2)
                .orElse(null);


        System.out.println(longestStr);
        System.out.println(smallestStr);
        System.out.println("-------------------------------------------------");

        //Using maxBy()
        String longest = list.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(String::length)))
                .get();


        //Using minBy()
        String smallest = list.stream()
                .collect(Collectors.minBy(Comparator.comparingInt(String::length)))
                .get();


        System.out.println(longest);
        System.out.println(smallest);
    }
}
