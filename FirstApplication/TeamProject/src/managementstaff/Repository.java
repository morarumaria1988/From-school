
package managementstaff;

import managementstaff.Programmers;
import managementstaff.SalePeople;
import managementstaff.Secretaries;
import static managementstaff.MethodsInPlace.myEmployees;

public class Repository {
    
    //pre initialazation for testing perposes
    public static void initial(){
        // create one programer class   (name,   age, address,    base salary, base bouns, number of programs)
        Programmers p1 = new Programmers("Simona", 20, "Stockholm",      20000,       1000,   5);
        Programmers p2 = new Programmers("Linda", 25, "Stockholm",      20000,       1000,   4);
        Programmers p3 = new Programmers("Lena", 33, "Stockholm",      20000,       1000,   6);
               // create one sale people class(name,      age, address,     base salary, base bouns, number of programs)
        SalePeople sp1 = new SalePeople("Natascha", 20, "Södertälje",20000      ,  1000,      3);
        SalePeople sp2 = new SalePeople("Emma", 20, "Södertälje",20000      ,  1000,      2);
       // create one Secretaries  class  (name,   age, address,     base salary, base bouns)
        Secretaries s1 = new Secretaries("Maria", 18, "Nynäshamn", 20000      ,1000);
        
        // add created classes to all the employee list (myEmployees)
        myEmployees.add(p1); //programer
         myEmployees.add(p2); //programer
          myEmployees.add(p3); //programer
        myEmployees.add(sp1);//sale person
        myEmployees.add(sp2);//sale person
        myEmployees.add(s1);//Sectretaries
    }
}
