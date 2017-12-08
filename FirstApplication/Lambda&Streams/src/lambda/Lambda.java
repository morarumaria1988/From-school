package lambda;

import java.util.*;

public class Lambda {

    public void runExercises() {
		System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
		System.out.println("Running exercise 1 solution...");
		exercise1();
		System.out.println("Running exercise 2 solution...");
		exercise2();
		System.out.println("Running exercise 3 solution...");
		exercise3();
		System.out.println("Running exercise 4 solution...");
		exercise4();
	}
	/**
	 * Exercise 1
	 *
	 * Create a string that consists of the first letter of each word in the list of
	 * Strings.
	 */
	private void exercise1() {
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
          StringBuilder sb=new StringBuilder();
          list.forEach(s->sb.append(s.charAt(0)));
       String result=sb.toString();
            System.out.println(result);
	}

	/**
	 * Exercise 2
	 *
	 * Remove the words that have odd lengths from the list.
	 */
	private void exercise2() {
		List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
                list.removeIf(s->(s.length())%2==1);
               list.forEach(System.out::println);
               //list.forEach(s->System.out.println(s));
	}

	/**
	 * Exercise 3
	 *
	 * Replace every word in the list with its upper case equivalent.
	 */
	private void exercise3() {
		List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
              //  list.replaceAll(s->s.toUpperCase());
              list.replaceAll(String::toUpperCase);
                list.forEach(System.out::println);
	}

	/**
	 * Exercise 4
	 *
	 * Convert every key-value pair of the map into a string and append them all
	 * into a single string, in iteration order.
	 */
	private void exercise4() {
		Map<String, Integer> map = new TreeMap<>();
		map.put("c", 3);
		map.put("b", 2);
		map.put("a", 1);
                StringBuilder sb=new StringBuilder();
          map.forEach((k,v)->sb.append(String.format("%s%s",k,v)));
       String result=sb.toString();
            System.out.println(result);
          
	}

	public static void main(String[] args) {
		Lambda lesson = new Lambda();
		lesson.runExercises();
	}
}