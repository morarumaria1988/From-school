package myExercices;
  
import java.util.Scanner;

public class Ex6 {
    
static Scanner sc = new Scanner(System.in);

    public static void main (String[]args) {
        
        System.out.print("Input the first number : ");
        int x = sc.nextInt();
        System.out.print("Input the second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The result is ");
      
        if (x%3==y%3 ||x%3==z%3||y%3==z%3)
                
            System.out.print("false ");
        else 
            System.out.println("true");     
       
}
}

