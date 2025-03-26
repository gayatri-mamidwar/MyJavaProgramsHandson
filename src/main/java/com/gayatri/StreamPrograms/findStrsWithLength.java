package com.gayatri.StreamPrograms;

/*
WA Java stream prog to convert a list of strings into a map with the string as the key & its length as the value
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findStrsWithLength {
    public static void main(String[] args) {

        List<String> al = new ArrayList<>(Arrays.asList("Gayatri", "Pritam", "Pooja", "Aarti", "Nandini", "Ram", "Pooja"));

//        gives String with its length
        Map<String, Integer> ans = al.stream()
                .collect(Collectors.toMap(e -> e, String::length));


        //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));    ...counts occurance of a string

        System.out.println(ans);
    }
}
