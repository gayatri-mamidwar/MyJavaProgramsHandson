package com.gayatri.StreamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> ans = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even no's = "+ans);
    }
}
