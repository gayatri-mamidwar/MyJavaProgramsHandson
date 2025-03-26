package com.gayatri.StreamPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Focus.. hard but imp
public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String input = "swiss";                     //o/p-w
        Character ans = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(ans);
    }
}
