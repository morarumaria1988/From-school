package Pers_Extended;

import java.util.*;

public class Stud extends Pers {

    private String Schoolname;
    private String Program;
    
//                  PAY ATTENTION to HashMap!!!
    
    private Map<String ,Double> myGrades = new LinkedHashMap<>();

//    public Stud() {
//    		
//    }

    public Stud(String SchoolName, String Program, String name, String address, int age) {
        super(name, address, age);

        this.Schoolname = SchoolName;
        this.Program = Program;

    }

    @Override
    public double bonus() {
        return calcAvg() * 1_000.0;
    }

    public void addGrade(String subject,double value) {
        myGrades.put(subject, value);
       
    }
//              NOT USED:
//    public Double getGrade(String subject) {
//    		return myGrades.get(subject);
//    }


    
    public void showGrades() {
    		
        for ( Map.Entry<String, Double> g: this.myGrades.entrySet()) {
            System.out.println("Subject: "+g.getKey()+" = "+g.getValue());
        }
    }

    public double calcAvg() {
        int counter = myGrades.size();
        double sum = 0;

        for (Map.Entry<String, Double> g: myGrades.entrySet()) {
            sum += g.getValue();
        }
        return sum / counter;
    }

    public String getSchoolname() {
        return Schoolname;
    }

    public String getProgram() {
        return Program;
    }

    @Override
    public String toString() {
    		return  "[ Stud "+ super.toString()+"]";
    }

    public void setSchoolname(String Schoolname) {
        this.Schoolname = Schoolname;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

}
