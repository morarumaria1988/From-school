package managementstaff;

import java.util.ArrayList;
import java.util.Iterator;
import managementstaff.Employee;
import managementstaff.Programmers;
import managementstaff.SalePeople;
import managementstaff.Secretaries;
import managementstaff.UI;

public class MethodsInPlace {

    double salary, bonus;
    static ArrayList<Employee> myEmployees = new ArrayList<>();

    // GENERAL MENU
    public void addEmployeebyDepatament() {
        int choice = UI.emplDepartament();
        System.out.println("\nEnter The Employee Name");
        String name = UI.readText();
        System.out.println("Enter The Age");
        int age = UI.readNumber();
        System.out.println("Enter The new Adress");
        String adress = UI.readText();
        System.out.println("Enter The No. of project");
        int noProject = UI.readNumber();


        switch (choice) {
            case 1:
                Secretaries s = new Secretaries(name, age, adress, 20000, 1000);
                myEmployees.add(s);
                break;

            case 2:
                Programmers p = new Programmers(name, age, adress, 20000, 1000, noProject);
                myEmployees.add(p);
                break;

            case 3:
                SalePeople sp = new SalePeople(name, age, adress, 20000, 1000, 3);
                myEmployees.add(sp);
                break;
            default:
                System.out.println("Wrong input try again.");

        }

    }

    public void removeEmplById(int id) {

        Employee emp = findEmployeeById(id);
        if (emp != null) {
            myEmployees.remove(emp);
        }
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : myEmployees) {
            if (emp.getEmployeeID() == id) {
                System.out.println(emp);
                return emp;
            }

        }
        System.out.println("There is no such Employee to Find!");
        return null;
    }
//hato
    public void updateEmployees(int id) {
        Employee emp = findEmployeeById(id);

        if (emp != null) { //&&(emp instanceof Programmers)){
            System.out.println("\nEnter The Employee Name");
            emp.setName(UI.readText());
            System.out.println("Enter The Age");
            emp.setAge(UI.readNumber());
            System.out.println("Enter The new Adress");
            emp.setAdress(UI.readText());
//            System.out.println("Enter The no. of Projects");
//            emp.
//            ;

            System.out.println("Employee has been changed");
            System.out.println(emp);
        } else {

            System.out.println("No such Employee");
        }
    }

    public void showAllEmployees() {
        for (Employee myEmpl : myEmployees) {
            System.out.println(myEmpl);
        }
    }

    public void removeEmplByAge(int age) {

        Iterator<Employee> it = myEmployees.iterator();

        while (it.hasNext()) {
            Employee emp = (Employee) it.next();
            if (emp.getAge() == age) {
                it.remove();
            }
        }

    }

    public void getAllEmployeesByDepartment(Class cls) {
        for (Employee myEmpl : myEmployees) {
            if (myEmpl.getClass().equals(cls)) {
                System.out.println(myEmpl);
            }
        }
    }

    public void avrageSalaryForAll() {
        double totalSalary = 0;

        for (Employee myEmployee : myEmployees) {
            totalSalary = totalSalary + myEmployee.getSalary();

        }
        double avregeSalary = totalSalary / myEmployees.size();
        System.out.println(avregeSalary);
    }

    /* public void avrageSalaryForAll2() {
        double sum = 0.0;
        double av = 0.0;
        Iterator<Employee> it = myEmployees.iterator();

        while (it.hasNext()) {
            Employee emp = (Employee) it.next();
            sum = sum + emp.getSalary();
        }
        av = sum / myEmployees.size();
        System.out.println(av);
    }*/
    public void avrageSalaryByDepartment() {
        double sumSec = 0; double sumprog = 0; double sumsale = 0;
        int sec = 0; int pro = 0; int sel = 0;
        for (Employee myEmployee : myEmployees) {

            if (myEmployee instanceof Secretaries) {
                sec++;
                sumSec = sumSec + myEmployee.getSalary();
            } else if (myEmployee instanceof Programmers) {
                pro++;
                sumprog = sumprog + myEmployee.getSalary();
            } else {
                sel++;
                sumsale = sumsale + myEmployee.getSalary();
            }
        }
        System.out.println("The Employees' Salary Avrage for :");
        System.out.println("\n                  -Programmers is " + sumprog / pro);
        System.out.println("\n                  -Sale people is " + sumsale / sel);
        System.out.println("\n                  -Sectretariesis " + sumSec / sec);

    }

    public void procentageEmployeeByDepartment() {
        double sumSec = 0; double sumprog = 0; double sumsale = 0;

        for (Employee myEmployee : myEmployees) {
            if (myEmployee instanceof Secretaries) {
                sumSec++;
            } else if (myEmployee instanceof Programmers) {
                sumprog++;
            } else {
                sumsale++;
            }
        }
        int sProg=(int)sumprog; int sSale=(int)sumsale; int sSec=(int)sumSec;
        System.out.println("The number of Employees for :");
        System.out.println("\n               -Programmers is " + sProg);
        System.out.println("\n               -Sale people is " + sSale);
        System.out.println("\n               -Secretaries is " + sSec);
        System.out.println("\n");

        System.out.println("The precentage of Employees for :");
        System.out.println("\n          -Programmers is " + sumprog / 100);
        System.out.println("\n          -Sale people is " + sumsale / 100);
        System.out.println("\n          -Secretaries is " + sumSec / 100);
    }

    public void totalSalaryForEmployee(){
        for (Employee myEmployee : myEmployees) {
        double totalSalary = myEmployee.getSalary()+myEmployee.getBonus();
            System.out.println("The Total Salary to ");
            System.out.println("             "+myEmployee.getEmployeeID()+"  "+myEmployee.getName()+ " ls= " +totalSalary);
        }
         
    }
}
