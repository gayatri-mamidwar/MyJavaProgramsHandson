package com.gayatri.StreamPrograms.MapComplexProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentClient {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student(1, "gayatri", 50),
                new Student(2, "Pooja", 70),
                new Student(3, "Nandi", 80),
                new Student(4, "Pritam", 90),
                new Student(5, "Aarti", 20),
                new Student(6, "Yogi", 40),
                new Student(7, "Pam", 60)
        ));
        System.out.println(studentList);

        //Group students by marks range (e.g. 90-100, 80-90).                                   ...HARD IMP
        Map<String, List<Student>> studentsGroupByMarks = studentList.stream()
                .collect(Collectors.groupingBy(s -> {
                    if(s.marks >= 90 && s.marks <= 100)  return "90-100";
                        else if (s.marks >= 50 && s.marks < 70) return "50-70";
                        else if (s.marks >= 70 && s.marks < 90) return "70-90";
                        else return "below 50";
                    }
                ));

        System.out.println(studentsGroupByMarks);
    }
}
