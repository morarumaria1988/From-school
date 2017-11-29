package arrays_powerpoint;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int[] arr = new int[sc.nextInt()];
        System.out.println("The size of the array is: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Type in the " + (i + 1) + " number: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        System.out.println("The sum of the numbers in the array is " + sum);
    }
}
