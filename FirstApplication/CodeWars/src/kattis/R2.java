
package kattis;

import java.util.Scanner;

public class R2 {
  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

   int R1 = sc.nextInt();
   int S = sc.nextInt();
   if ((R1<1000&&R1>-1000)&&(S<1000&&S>-1000))
        System.out.println(2*S-R1);
   else System.out.println("Wrong input, please rung again and type two integers R1 and S, both between −1000 and 1000");
    }
 
}
