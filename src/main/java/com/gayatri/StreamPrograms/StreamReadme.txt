1.chars() -> str.chars().forEach(ch -> System.out.print((char) ch + " "));        //i/p- success      o/p- s u c c e s s

2.sorted(Collectors.reverseOrder()) -> for descending order sort

3.You need a mapping of each element to a specific computed value (e.g., word to its length)-
	Collectors.toMap(keyMapper, valueMapper)

4.You need to count occurrences of elements in a list-
	Collectors.groupingBy(Function.identity(), Collectors.counting())  [or U can use e->e instead of Function.identity()]
