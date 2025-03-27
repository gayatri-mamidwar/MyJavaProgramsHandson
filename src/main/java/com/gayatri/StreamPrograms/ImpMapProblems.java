package com.gayatri.StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ImpMapProblems {
    public static void main(String[] args) {

        // Convert List of Integers to a Map with Square as Value
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Map<Integer, Integer> squareMap = list.stream().collect(Collectors.toMap(e -> e, e-> e*e));

        System.out.println(squareMap);      //no need of for loop for printing map

        List<String> words = Arrays.asList("Apple", "Banana", "Orange", "kiwi", "guava", "pineapple");

        //Convert a list of strings to a map with string length as the key and string as the value.
        Map<Integer,List<String>> groupByLen = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLen);

        //Count the frequency of each character in a string. (Return Map<Character, Integer>)
        //Map<Character, Long> map = words.stream().map(c -> c.chars()).collect(Collectors.counting());  ...wrong implementation
        String s = "Banana";
        Map<Character, Integer> map = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));
        System.out.println(map);
    }
}
