package com.gayatri.StreamPrograms.MapComplexProblems;

import java.util.*;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        // Convert List of Employees to Map (id -> Employee Object)
        List<Employee> employeeList = Arrays.asList(
                new Employee(101L, "Gayatri", "IT", 30000),
                new Employee(102L, "Pooja", "Civil", 40000),
                new Employee(103L, "Nandini", "IT", 40000),
                new Employee(104L, "Aarti", "ETC", 30000),
                new Employee(105L, "Yogi", "Cyber", 70000),
                new Employee(106L, "Pam", "ETC", 50000),
                new Employee(107L, "Pritam", "Cyber", 90000)
        );

        Map<Long, Employee> empMap = employeeList.stream()
                .collect(Collectors.toMap(e -> e.id, e->e));
        System.out.println(empMap);
        System.out.println("------------------------------------");

        //Group Employees by Department
        Map<String, List<Employee>> deptWiseEmp = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.deptName));
        System.out.println(deptWiseEmp);

        System.out.println("------------------------------------");

        //Count employees by department
        Map<String, Long> deptWiseCountEmp = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.deptName, Collectors.counting()));
        System.out.println(deptWiseCountEmp);

        System.out.println("------------------------------------");

        //Employee as Key and Salary as Value
        Map<Employee, Long> empSalaryList = employeeList.stream()
                .collect(Collectors.toMap(e->e, e->e.id * 10000));
        System.out.println(empSalaryList);

        System.out.println("------------------------------------");

        //Find the highest salary in each department                                    ......Hard
        Map<String, Optional<Employee>> deptWiseHighSal = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.deptName,
                        Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))));

        //OR alternate solution
//        Map<String, Employee> map2 = employeeList.stream()
//                        .collect(Collectors.toMap(e -> e.deptName,
//                                e -> e,
//                                (e1,e2) -> e1.salary > e2.salary ? e1 : e2));
//        System.out.println("Alternate : " + map2);

        System.out.println(deptWiseHighSal);
        System.out.println("------------------------------------");

        //Group a list of Employees by dept and get the total salary of each dept. (Return Map<dept, Double>)
        Map<String, Double> deptWiseTotalSal = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.deptName,
                        Collectors.summingDouble(e -> e.salary)));
        System.out.println(deptWiseTotalSal);
        System.out.println("------------------------------------");

        //Group employees by department and find the average salary of each department
        Map<String, Double> deptWiseAvgSal = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.deptName,
                        Collectors.averagingDouble(e -> e.salary)));
        System.out.println(deptWiseAvgSal);
        System.out.println("------------------------------------");
    }
}
