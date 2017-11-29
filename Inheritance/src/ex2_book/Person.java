
package ex2_book;


public  class Person {
   String name, address, phone ,  email;
public Person (String name){
    this.name=name;
    
}
    @Override
    public String toString() {
        return "Person "+ name ;
    }
   
}
class Student extends Person {
     Status status;

    public Student(String name) {
        super(name);
    }
   
     @Override
     public String toString() {
        return "Student "+ name ;
    }
    }
 class Employee extends Person{
     String office;
     Double salary;
     String inputHiredDate="2016-11-01";
     java.time.LocalDate hiredDate=java.time.LocalDate.parse(inputHiredDate);

    public Employee(String name) {
        super(name);
    }
     @Override
     public String toString() {
        return "Employee "+ name ;
    }
    }
 class Faculty extends Employee{
    String rank;  
    String workingHours ="8:00-17:00";

    public Faculty(String name) {
        super(name);
    }
    @Override
     public String toString() {
        return "Faculty "+ name ;
    }
    }
    
 class Staff extends Employee{
      String title;  

    public Staff(String name) {
        super(name);
    }
    @Override
     public String toString() {
        return "Staff "+ name ;
    }
    }  
