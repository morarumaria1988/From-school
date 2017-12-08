/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems_3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int x = sc.nextInt();
         System.out.print("Input the second number : ");
        int y = sc.nextInt();
        if (x == y) {
            System.out.println("Result: 0");
        } else if (x % 6 == y % 6) {
            if (x > y) {
                System.out.println("Result: "+y);
            } else {
                System.out.println("Result: "+x);
            }
        } else if (x > y) {
            System.out.println("Result: "+x);
        } else {
            System.out.println("Result: "+y);
        }

    }

}
