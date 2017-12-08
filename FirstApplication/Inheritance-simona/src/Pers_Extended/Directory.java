package Pers_Extended;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pers> myPers = new ArrayList<>();

    public static void addCreatedPers() {

        myPers.add(new Empl("k", "bgjrd 25", 49, 9, 30000));
        myPers.add(new Empl("l", "fsbha 25", 57, 14, 40000));
        myPers.add(new Empl("e", "y54wy 25", 29, 3, 10000));
        myPers.add(new Empl("p", "ios 25", 37, 6, 25000));
        myPers.add(new Athl("d", "ghs 10", 35, 10));
        myPers.add(new Athl("g", "egwgr 10", 19, 2));
        myPers.add(new Athl("k", "dbhd10", 27, 4));
        myPers.add(new Athl("t", "e5y54y 10", 39, 7));
        myPers.add(new Stud("Cambrige", "Literature", "A", "NDFL 65", 21));
        myPers.add(new Stud("Oxford", "Computers", "B", "SJDG 25", 18));
        myPers.add(new Stud("Sorbonne", "History", "C", "JSYH 10", 26));
        myPers.add(new Stud("Binghamton", "Cultures", "D", "THTH 2", 26));

        System.out.println("List of Athlets:");
        System.out.println("\n------------------------------------");
        showPers("Pers_Extended.Athl");

        System.out.println("List of Students:");
        System.out.println("\n------------------------------------");
        showPers("Pers_Extended.Stud");

        System.out.println("List of Employee:");
        System.out.println("\n------------------------------------");
        showPers("Pers_Extended.Empl");
    }

    public static void selectGrades() {
        while (true) {
            System.out.println("Grades of Students:");
            System.out.println("\n------------------------------------");
            System.out.println("Give a personId for student");
            int personId = sc.nextInt();
            sc.nextLine();
            Stud s = null;

            for (Pers p : myPers) {
                if (p instanceof Stud) {
                    if (p.getId() == personId) {
                        s = (Stud) p;
                        System.out.println("Input grade for student " + p.getName() + ": ");
                        double grade = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Input a subbject ={Mathemetic, Literature, Sciences, Chemestry}:");
                        String subj = sc.nextLine();
                        s.addGrade(subj, grade);
                    }
                }
            }
            s.showGrades();
            System.out.println("\n");

            System.out.println("Grades for another Student? Y/N?");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thank you!");
                break;
            }
        }
    }

    public static void showPers(String c) {
        for (Pers p : myPers) {
            if (p.getClass().getName().equalsIgnoreCase(c)) {
                System.out.println(p);
            }
        }
    }
    

}
