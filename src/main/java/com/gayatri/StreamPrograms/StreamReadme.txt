1.chars() -> str.chars().forEach(ch -> System.out.print((char) ch + " "));        //i/p- success      o/p- s u c c e s s

2.sorted(Collectors.reverseOrder()) -> for descending order sort

3.You need a mapping of each element to a specific computed value (e.g., word to its length)-
	Collectors.toMap(keyMapper, valueMapper)

4.You need to count occurrences of elements in a list-
	Collectors.groupingBy(Function.identity(), Collectors.counting())  [or U can use e->e instead of Function.identity()]

5. Collectors.groupingBy() -> takes 1,2 param depends on question
6. Collectors.toMap(k,v) -> takes 2 param
7. Return type of Collectors counting() is Long

/* For counting elements in groups → Use groupingBy(e -> key, Collectors.counting()).
   For simple key-value mappings with unique keys → Use toMap().
   Don’t use Collectors.counting() inside toMap() – it doesn’t work there.
   ex- collect(Collectors.toMap(e->e.deptName, Collectors.counting())               ...WRONG cant use count with tomap
*/

8.Collectors.summingInt/Double() based on d.t of which attri sum we r taking            ...FOR SUM => summing()
9.Collectors.averagingInt/Double() based on d.t of which attri avg we r taking          ...FOR AVG => averaging()
10. Collectors.comparingDoublr/Int() based ....                                         ...FOR compare => comparing()