package com.gayatri.StreamPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ImpStreamPrograms {
    public static void main(String[] args) {

        //1. Convert any List into a map in one line
        List<String> items = Arrays.asList("java","is","c++","oop");
        Map<String, Integer> itemLengthMap = items.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(itemLengthMap);
        System.out.println("--------------------------------------");

        //2. use computeIfAbsent() to avoid null checks in map
        Map<String, List<String>> map = new HashMap<>();

        map.computeIfAbsent("Java", k -> new ArrayList<>()).add("Streams API");
        map.computeIfAbsent("Java", k -> new ArrayList<>()).add("Lambdas");
        System.out.println(map);
        System.out.println("--------------------------------------");

        //3. Merge 2 maps without a loop
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Spring", 8);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Java", 5);
        map2.put("Hibernate", 6);

        /* Syntax of merge() -
            map1.merge(key, newValue, BiFunction<oldValue, newValue, result>);

            If map1 contains k, update its value using the function (Integer::sum).
            If map1 does not contain k, insert (k, v) as a new key-value pair.
         */
        map2.forEach((k, v) -> map1.merge(k,v,Integer::sum));
        System.out.println(map1);
        System.out.println("---------------------------------------");

        //4. COnvert list to comma seperated string
        List<String> languages = Arrays.asList("Java", "python", "oop");
        String ans = languages.stream()
                .collect(Collectors.joining(","));
        System.out.println(ans);
        System.out.println("-----------------------------------------");
    }
}
