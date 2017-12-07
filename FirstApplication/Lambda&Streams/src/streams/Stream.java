package streams;
  import java.util.*;
import java.util.stream.Collectors;
public class Stream {

  public void runExercises()  {
    System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 2");
    System.out.println("Running exercise 1 solution...");
    exercise1();
    System.out.println("Running exercise 2 solution...");
    exercise2();
    System.out.println("Running exercise 3 solution...");
    exercise3();
    System.out.println("Running exercise 4 solution...");
    exercise4();
    System.out.println("Running exercise 5 solution...");
    exercise5();
  }

  /**
   * Exercise 1
   *
   * Create a new list with all the strings from original list converted to
   * lower case and print them out.
   */
  private void exercise1() {
    List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
      List<String> newList = list.stream()
           .map(String::toLowerCase)
              .collect(Collectors.toList());
      
      newList     .forEach(System.out::println);
/***output
    the
    quick
    brown
    fox
    jumped
    over
    the
    lazy
    dog
 */
  }

  /**
   * Exercise 2
   *
   * Modify exercise 1 so that the new list only contains strings that have an
   * odd length
   */
  private void exercise2() {
    List<String> list = Arrays.asList(
        "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
      List<String> newList = list.stream()
            .filter(s->s.length()%2==1)
           .map(String::toLowerCase)
              .collect(Collectors.toList());
      
      newList     .forEach(System.out::println);
    
   /** Output
    the
    quick
    brown
    fox
    the
    dog
    **/
  }

  /**
   * Exercise 3
   *
   * Join the second, third and forth strings of the list into a single string,
   * where each word is separated by a hyphen (-). Print the resulting string.
   */
  private void exercise3() {
    List<String> list = Arrays.asList(
        "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
String merged = list.stream()
        .skip(1)
        .limit(3)
        .collect(Collectors.joining("-"));
      System.out.println(merged);
    
 /** Output   
     quick-brown-fox
 **/
  }

  /**
   * Exercise 4
   *
   *Sort the Map by key.
   * 
   */
  private void exercise4() {
    Map<String, Integer> unsortMap = new HashMap<String,Integer>();

    unsortMap.put("student4", 50);
    unsortMap.put("student5", 70);
    unsortMap.put("student7", 75);
    unsortMap.put("student7", 65);
    unsortMap.put("student1", 90);
    unsortMap.put("student2", 55);
    unsortMap.put("student6", 35);
    unsortMap.put("student3", 25);
    
    System.out.println("Original...");
    System.out.println(unsortMap);
    
     Map<String, Integer> sortMap = unsortMap.entrySet().stream()
             .sorted(Map.Entry.comparingByKey())
             .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (oldValue, newValue) ->{
            System.out.println("Duplicate keys !!!");
            return oldValue;
        }, LinkedHashMap::new));
      System.out.println(sortMap);
    sortMap.entrySet().forEach(System.out::println);
 
    /** Output
     {student1=50, student2=70, student3=75, student4=90, student5=55, student6=35, student7=25}
     * **/
  }
 
  
  /**
   * Exercise 5
   *
   *Sort the Map by value.
   * 
   */
  private void exercise5() {
    Map<String, Integer> unsortMap = new HashMap<String,Integer>();
    unsortMap.put("student4", 50);
    unsortMap.put("student5", 70);
    unsortMap.put("student7", 75);
    unsortMap.put("student1", 90);
    unsortMap.put("student2", 55);
    unsortMap.put("student6", 35);
    unsortMap.put("student3", 25);
    
    System.out.println("Original...");
    System.out.println(unsortMap);
    
     Map<String, Integer> sortMap = unsortMap.entrySet().stream()
             .sorted(Map.Entry.comparingByValue())
             .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
      System.out.println(sortMap);
    sortMap.entrySet().forEach(System.out::println);
 
    
 
    /** Output
     {student4=90, student3=75, student2=70, student5=55, student1=50, student6=35, student7=25}
     * **/
  }
  
  public static void main(String[] args) {
    Stream lesson = new Stream();
    lesson.runExercises();
  }
}

