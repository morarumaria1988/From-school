package managementstaff;
//create class SalePeople which inhirented from class Employee 

//added future are:
// number of sales
//claculate the salary
//claculate the bouns
//  @Override methoud ( calculateSalary()) becuse it has diffrent equation 
public class SalePeople extends Employee {

    private int noOfSales=1;

    //call the Employee (super) and calculate the salary and bouns
    public SalePeople( String name, int age, String adress, double baseSalary, double baseBonus,int noOfSales) {
        super(name, age, adress, baseSalary, baseBonus);
        this.noOfSales = noOfSales;
        calculateBonus();
        calculateSalary();
    }

    

    public int getNoOfSales() {
        return noOfSales;
    }

    public void setNoOfSales(int noOfSales) {
        this.noOfSales = noOfSales;
    }

      //over ride calculate salary 
    // number(3) is the salary rank for sale people
    @Override
    public void calculateSalary() {

        setSalary(getBaseSalary() * 3);
    }

    public void calculateBonus() {
        setBonus(noOfSales*getBaseBonus());
    }


    @Override
    public String toString() {
        String info = super.toString();
        return info;
    }

}
