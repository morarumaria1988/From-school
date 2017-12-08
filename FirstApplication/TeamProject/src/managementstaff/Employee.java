package managementstaff;
// declare main class name Employee and define it's attribute
public abstract class Employee {
    
    private static int i = 1000;
    private int employeeID = 0;
    private String name;
    private int age;
    private String adress;
    private double baseSalary;
    private double baseBonus;
    private double salary;
    private double bonus;
  
    
    //fill the Class (Employee) attribute within values   
    public Employee(String name, int age, String adress, double baseSalary, double baseBonus) {
        this.employeeID = ++i;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.baseSalary = baseSalary;
        this.baseBonus = baseBonus;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double getBaseBonus() {
        return baseBonus;
    }
    
    public void setBaseBonus(double baseBonus) {
        this.baseBonus = baseBonus;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void calculateSalary() {
        setSalary(baseSalary);
        
    }
    
    public void calculateBonus() {
        setBonus(baseBonus);
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    // print all the class attribute except (baseSalary) and (baseBonus);
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", name=" + name + ", Age=" + age + ", adress=" + adress + ", salary=" + salary +"  Bonus: "+ bonus+ '}';
    }
}
