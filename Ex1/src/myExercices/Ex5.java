
package myExercices;
import java.util.Scanner;

public class Ex5 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args) {
        System.out.print("Input the first number : ");
        int x = sc.nextInt();
        System.out.print("Input the second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The result is ");
        if (x<y&&y<z)
            System.out.print("true ");
        else 
            System.out.println("not true");     
        System.out.println("\n");
}
}
