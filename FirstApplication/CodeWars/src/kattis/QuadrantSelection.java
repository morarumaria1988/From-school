package kattis;

import java.util.Scanner;

public class QuadrantSelection {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        
        int y = sc.nextInt();
        if ((x <= 1000 && x > 0 && y <= 1000 && y > 0)) 
            System.out.println("1");
         else if ((x >= -1000 && x < 0 && y <= 1000 && y > 0)) 
            System.out.println("2");
         else if ((x >= -1000 && x < 0 && y >= -1000 && y < 0))
            System.out.println("3");
        
         else if ((x <= 1000 && x > 0 && y >= -1000 && y < 0)) 
            System.out.println("4");
         else 
            System.out.println("wrong integer");
        

    }

}
