package com.gayatri.StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreq {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("map = "+map);
    }
}
