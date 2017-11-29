package myExercices;

import java.util.Scanner;

public class Ex7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Input seconds: ");
        int x = sc.nextInt();
        System.out.println(x / 3600 + ":" + (x % 3600) / 60 + ":" + (x % 3600) % 60);
    }
}
