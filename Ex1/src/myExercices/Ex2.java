
package myExercices;

import java.util.Scanner;


public class Ex2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number:");
            int x = sc.nextInt();
            sc.nextLine();
            if (x%2==0)
            System.out.println("1");
            else  
            System.out.println("0");
        
        
    }
    
}
