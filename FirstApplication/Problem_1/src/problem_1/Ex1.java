package problem_1;
 
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give me a number to print a multiplication table for:");
        int a=sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
    
}
