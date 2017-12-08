
package problems_3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.print("Input a word: ");
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
        System.out.println("Reverse word: "+reverse(a));
    }
     public static String reverse(String a){
         String reversed="";
         for (int i=a.length()-1; i >=0; i--) {
             reversed+=a.charAt(i);
             
         }
         return reversed;
     }
}
