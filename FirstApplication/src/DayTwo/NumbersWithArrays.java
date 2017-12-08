package DayTwo;

import java.util.Scanner;

public class NumbersWithArrays {

    static int[] numbers = new int[10];
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    static int count = 0;

    public static void main(String[] args) {
        while (loop) {
            switchChoice(menu());
        }
    }

    public static void switchChoice(int choice) {
        switch (choice) {
            case 1:
                addNumbersToArray();
                break;
            case 2:// deleteFirstOccuranceOfNumber();
                break;
            case 3: //deleteAllOccurancesOfNumber();
                break;
            case 4: //clearTheArray();
                break;
            case 5: //calculateSum();
                break;
            case 6: //calculateAverage();
                break;
            case 7:
                listAllNumbers();
                break;
            case 8:
                break;
            default:
                System.out.println("No suck option, try again...");
        }
    }

    public static void addNumbersToArray() {
        int countLocal=count;
        System.out.println("How many numbers do you want to add?");
        int amount = sc.nextInt();
        for (int i = countLocal; i < amount+countLocal; i++) {
            System.out.println("Number" + (i + 1) + ": ");
            int number = sc.nextInt();
            sc.nextLine();
            
            numbers[i] = number;
            count++;
        }
    }

    public static void listAllNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    private static int menu() {
        //displays options and reads in a number that it returns
        System.out.println("\n************Menu************");
        System.out.println("****************************");
        System.out.println("1. Add numbers to operate on: ");
        System.out.println("2. Delete the first occurence of a number");
        System.out.println("3. Delete all occurences of a number.");
        System.out.println("4. Clear the array");
        System.out.println("5. Calculate sum");
        System.out.println("6. Calculate average");
        System.out.println("7. List all numbers");
        System.out.println("8. Terminate the program\n");
        System.out.print(" Make a choice: ");
        int choice = sc.nextInt();
        return choice;
    }

}
