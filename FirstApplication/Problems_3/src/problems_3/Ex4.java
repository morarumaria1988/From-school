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
public class Ex4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(checkPrime(x));

    }

    public static boolean checkPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }

        }
        
return true;
    }

}
