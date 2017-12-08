package problems_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//public class Program {
//    enum Rank {
//        SOLDIER,
//        SERGEANT,
//        CAPTAIN
//    }
//    public static void main(String[] args) {
//        Rank a = Rank.SOLDIER;
//                
//        switch(a) {
//            case SOLDIER:
//                System.out.println("Soldier says hi!");
//                break;
//            case SERGEANT:
//                System.out.println("Sergeant says Hello!");
//                break;
//            case CAPTAIN:
//                System.out.println("Captain says Welcome!");
//                break;
//        }
//    }
//}
public class Program {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ulf");
        list.add("Annika");
        list.add("Arne");
        list.add("Mali");
        //Collections.sort(list, new StringLengthComparator());
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
        System.out.println(list);
        list.stream()
        .filter(s -> s.contains("l"))
        .sorted((s1,s2)->s1.compareTo(s2))
        .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}

//class StringLengthComparator implements Comparator<String>{
//    @Override
//    public int compare (String o1, String o2){
//    return o1.length()-o2.length();}
//}

class AFilter implements Predicate<String> {

    @Override
    public boolean test(String t) {
        return t.contains("a");
    }
    
    
}
