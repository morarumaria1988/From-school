
import java.util.ArrayList;


public class Sorting {

    public static void main(String[] args) {
       ArrayList <Student> studentArr=new ArrayList<>();
        
        studentArr.add(new Student("Kalle",45));
        studentArr.add(new Student("Olle",35));
        studentArr.add(new Student("Lars",25));
        studentArr.add(new Student("Mats",15));
        
        studentArr.sort(null);
        System.out.println(studentArr);
    }
    
}
