package myExercices;

import java.util.Scanner;

public class Ex4 {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[]args) {
        System.out.print("Input the first number : ");
        int x = sc.nextInt();
        System.out.print("Input the second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The result for ");
        if (z==x+y)
            System.out.println("true ");
        else 
            System.out.println(x+"+"+y+" is not "+z);          
}
}

