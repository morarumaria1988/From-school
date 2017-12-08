package arrays_powerpoint;

import java.util.Scanner;

public class Exercise3 {

    static Scanner sc = new Scanner(System.in);
    static int[] arr;

    public static void main(String[] args) {
        createTheArray();
        fillArray();
        printArray();
        System.out.println("The sum of the numbers in the array is " + sumElements());
        System.out.println("The average of the numbers in the array is " + averageOfElements());

    }

    public static void createTheArray() {
        System.out.println("How many numbers do you want to input?");
        arr = new int[sc.nextInt()];
    }

    public static void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Type in the " + i + " number: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray() {
//        sc.nextLine();
        int count = 0;
        for(int i =0; i<arr.length;i++){
            System.out.println("The number at index " + i + " is " + arr[i]);
        }
        for (int i : arr) {
//            System.out.println(i);
            System.out.println("The number at index " + count++ + " is " + i);
        }
    }

    public static int sumElements() {
        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        return sum;
    }

    public static double averageOfElements() {

        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        double average = sum /(double) arr.length;
        return average;
    }
}
