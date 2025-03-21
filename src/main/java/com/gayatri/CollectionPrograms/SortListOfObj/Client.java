package com.gayatri.CollectionPrograms.SortListOfObj;

/* Sort a List of Objects -
Sort a list of custom objects (like Student with name and age) using Comparator or Comparable.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Gayatri", 70, 27));
        list.add(new Student(102, "Pritam", 80, 28));
        list.add(new Student(103, "Pooja", 75, 27));
        list.add(new Student(104, "Yogesh", 95, 28));
        list.add(new Student(105, "Nandini", 85, 22));

//        Collections.sort(list);                                     //default sort by age

        //Custom sort. if age is same sort by id
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() == o2.getAge()){
                    return o1.getId() - o2.getId();
                } else{
                    return o1.getAge() - o2.getAge();
                    //o1.getName().compareTo(o2.getName());             //to sort by Name
                }
            }
        });

        System.out.println("after sorting list : " + list);
    }
}
