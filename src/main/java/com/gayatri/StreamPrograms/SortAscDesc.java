package com.gayatri.StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscDesc {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 2, 7);

        List<Integer> ascOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> descOrder = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted in asc : " + ascOrder);
        System.out.println("Sorted in desc : "+descOrder);
    }
}
