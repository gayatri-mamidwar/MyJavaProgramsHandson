package com.gayatri.CollectionPrograms;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        /*
        Reverse a List using Java collections or a custom approach (using Collections.reverse() or ListIterator).
         */

        //ListIterator -> move both direction forward & backward. next(),hasNext(),previous(),hasPrevious()
        //Iterator -> only forward direction. next(),hasNext()

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(200);
        list.add(30);

        ListIterator<Integer> listIterator = list.listIterator(list.size()); // IMP-> Start from the end

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("-------------------------------------------------");
        List<String> names = new LinkedList<>();
        names.add("learn");
        names.add("from");
        names.add("Geeksforgeeks");

        // Getting ListIterator
        ListIterator<String> listIterator1
                = names.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Traversing elements, the iterator is at the end
        // at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
