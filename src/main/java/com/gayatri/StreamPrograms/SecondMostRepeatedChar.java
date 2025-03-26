package com.gayatri.StreamPrograms;

/*
Find second most repeated char in string
step1- count char freq
step2 - find 2nd most repeated using map
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Difficult but imp .....

public class SecondMostRepeatedChar {
    public static void main(String[] args) {

        String str = "success";      // s->3, u->1, c->2, e->1        1st->s, 2nd->c          o/p->c

        Map<Character, Long> charFreq = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        Character secondMost = charFreq.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .skip(1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("second most repeated char : "+secondMost);

    }
}
