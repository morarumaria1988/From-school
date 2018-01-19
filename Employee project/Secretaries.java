package management_staff;


//create class Secretaries which inhirented from class Employee 

import management_staff.Employee;


//added future are:

//claculate the salary
//claculate the bouns
//  @Override methoud ( calculateSalary()) becuse it has diffrent equation 
public class Secretaries extends Employee {

    public Secretaries(String name, int age, String adress, double baseSalary, double baseBonus) {
        super(name, age, adress, baseSalary, baseBonus);
        calculateSalary();
        calculateBonus();

    }
    
     //over ride calculate salary 
    // number(2) is the salary rank for Secretaries
    @Override
     public void calculateSalary(){
         setSalary(getBaseSalary()*2);
         
    }

    @Override
    public String toString() {
        String info = super.toString();
        return info;
    }
}
