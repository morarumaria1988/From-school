
package Pers_Extended;


public class Empl extends Pers{
 
    private int noOfProjects;
    private double salary;
    
    @Override
    public double bonus(){
        return noOfProjects*1000;
    }

public Empl(String name, String address, int age,int noOfProjects, double salary){
    super(name,address,age);
    this.noOfProjects=noOfProjects;
    this.salary=salary;
}

    public int getNoOfProjectj() {
        return noOfProjects;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
    		return  "[ Empl "+ super.toString()+"]";
        
    }

    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }


    
    
    
}
