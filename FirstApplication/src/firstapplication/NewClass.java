package firstapplication;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = sc.nextInt();

        System.out.print("Input the first number: ");
        int b = sc.nextInt();
        System.out.println("Result: " + number(a, b));
    }

    private static int number(int a, int b) {
        if (a % 6 == b % 6) {
            if (a < b) {
                return a;
            }else {
                return b;
            }
        } else if (a == b) {
            return 0;
        } else if (a < b) {
            return b;
        } else {
            return a;
        }
        
    }
}
