package management_staff;
// all the projects User Interfaces menus 

import management_staff.Secretaries;
import management_staff.SalePeople;
import management_staff.Programmers;
import java.util.Scanner;

public class UI {

    static boolean Loop = true;
    static Scanner sc = new Scanner(System.in);

    public static int readNumber() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static String readText() {
        String txt = sc.nextLine();
        return txt;
    }

    public static int mainMenu() {
        System.out.println("\n************Main Menu*************");
        System.out.println("\n");
        System.out.println("Enter your Choice");
        System.out.println("1. General Information");
        System.out.println("2. Statistics Information");
        System.out.println("3. Exit");
        return readNumber();
    }

    public static int generalInfo() {
        System.out.println("\n************General Info List*************");
        System.out.println("\n");
        System.out.println("Enter your Choice");
        System.out.println("1. Add employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Find employee ");
        System.out.println("4. Update employee ");
        System.out.println("5. Show all employees ");
        System.out.println("6. Go to Main Menu ");
        return readNumber();
    }

    public static int statisticInfo() {
        System.out.println("\n************Statistic Menu*************");
        System.out.println("\n");
        System.out.println("Enter your Choice");
        System.out.println("1. Remove employee by Age");
        System.out.println("2. Show employee by Department");
        System.out.println("3. Average salary for all Employees");
        System.out.println("4. Average salary employees by Departament");
        System.out.println("5. Number & percentage of employees for each Department");
        System.out.println("6. Show the Total Salary for each employee ");
        System.out.println("7. Show all employees ");
        System.out.println("8. Go to Main Menu ");
        return readNumber();
    }

    public static int emplDepartament() {
        System.out.println("What kind of Employee?");
        System.out.println("1. Secretary");
        System.out.println("2. Programmers");
        System.out.println("3. SalesPeople");
        System.out.print("Make a choice:");
        return UI.readNumber();

    }

    public static Class chekClass() {
        int i;
        i = UI.emplDepartament();
        if (i == 1) {
            return Secretaries.class;
        } else {
            if (i == 2) {
                return Programmers.class;
            } else {
                if (i == 3) {
                    return SalePeople.class;

                }
            }
        }
        return null;

    }
}
