package Pers_Extended;

import java.util.Dictionary;

public class Main {

    static Directory dr = new Directory();
    static boolean loop=true;

    public static void main(String[] args) {
        while (loop=true) {
            switchCase(opt());
        }
    }

    public static void switchCase(int opt) {
        switch (opt) {
            case 1:
                Directory.addCreatedPers();
                break;
            case 2:
                Directory.selectGrades();
                break;
            case 3:
//                 Directory.showPers(String c);
                break;
            case 4:
                System.out.println("Thank you!");
                loop=false;
                break;
            default:
                System.out.println("No option/ Try again!");
        }
    }

    public static int opt() {
        System.out.println("\n----------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("1. Add Created persons");
        System.out.println("2. Add  grades byK for Students");
        System.out.println("3. Show persons");
        System.out.println("4. Terminate");
        System.out.println("No option!Try again!");

        System.out.println("Insert an option:");
        int opt = Directory.sc.nextInt();
        Directory.sc.nextLine();
        return opt;
    }
}
