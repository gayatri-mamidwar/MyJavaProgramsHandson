package com.gayatri.StreamPrograms.MapComplexProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        // Convert List of Employees to Map (id -> Employee Object)
        List<Employee> employeeList = Arrays.asList(
                new Employee(101L, "Gayatri", "IT"),
                new Employee(102L, "Pooja", "Civil"),
                new Employee(103L, "Nandini", "IT")
        );

        Map<Long, Employee> empMap = employeeList.stream()
                .collect(Collectors.toMap(e -> e.id, e->e));
        System.out.println(empMap);

        //Group Employees by Department
        Map<String, List<Employee>> deptWiseEmp = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.deptName));
        System.out.println(deptWiseEmp);

        //Count employees by department
        Map<String, Long> deptWiseCountEmp = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.deptName, Collectors.counting()));
        System.out.println(deptWiseCountEmp);

        //Employee as Key and Salary as Value
        Map<Employee, Long> empSalaryList = employeeList.stream()
                .collect(Collectors.toMap(e->e, e->e.id * 10000));
        System.out.println(empSalaryList);

    }
}
