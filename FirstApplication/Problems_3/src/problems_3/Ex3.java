
package problems_3;

import java.util.Scanner;

public class Ex3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int x=sc.nextInt();
        System.out.print("Input the second number : ");
        int y=sc.nextInt();
        System.out.println(calculateModulus( x, y));
        
    }
 public  static int    calculateModulus(int a, int b){
     int x=a;
     while (x>=b){
         x=x-b;
     }
     return x;
 }
    
}
