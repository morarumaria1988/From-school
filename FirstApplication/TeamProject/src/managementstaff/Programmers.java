package managementstaff;
//create class Programmers which inhirented from class Employee 

//added future are:
// number of projects 
//claculate the salary
//claculate the bouns
//  @Override methoud ( calculateSalary()) becuse it has diffrent equation 
public class Programmers extends Employee {

    private int noOfProjects=1;

//call the Employee (super) and calculate the salary and bouns
    public Programmers( String name, int age, String adress, double baseSalary, double baseBonus,int noOfProjects) {
        super(name, age, adress, baseSalary, baseBonus);
        this.noOfProjects = noOfProjects;
        calculateBonus();
        calculateSalary();
    }

    

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public void setNoOfProjects(int NoOfProjects) {
        this.noOfProjects = NoOfProjects;
    }

    public void calculateBonus() {
        setBonus(noOfProjects*getBaseBonus());
    }

    //over ride calculate salary 
    // number(4) is the salary rank
    @Override
    public void calculateSalary() {
        setSalary(getBaseSalary() * 4);
    }

    
    
    @Override
    public String toString() {
        String info = super.toString();
        return info;
    }

}
