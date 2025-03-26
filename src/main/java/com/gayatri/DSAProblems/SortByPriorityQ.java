package com.gayatri.DSAProblems;

import java.util.PriorityQueue;

/* Priority Queue Operations -
Implement a priority queue using PriorityQueue. Use custom objects or integer values with priorities.
 */
public class SortByPriorityQ {
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(101, "Gayatri", 28));
        pq.add(new Student(102, "Aarti", 23));
        pq.add(new Student(103, "Nandini", 27));
        pq.add(new Student(104, "Pooja", 23));

        System.out.println("size = " + pq.size());

        //for(int i=0; i<pq.size(); i++) {            //Wrong bcz after removing ele size decreases.size should cal once
        while (!pq.isEmpty()) {                     //removes min priority ele 1st
            System.out.println(pq.poll());
        }

        /* Using Priority queue on Integer
        // Priority Queue Min Type
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(50);
        pq.add(10);
        pq.add(100);
        System.out.println("size = " + pq.size());

        //for(int i=0; i<pq.size(); i++) {            //Wrong bcz after removing ele size decreases.size should cal once
        while (!pq.isEmpty()) {                     //removes min priority ele 1st
            System.out.println(pq.poll());
        }
         */
    }

    static class Student implements Comparable<Student> {
        private int rollNo;
        private String name;
        private int age;

        public Student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //Default remove by min age
        @Override
        public int compareTo(Student o) {
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
