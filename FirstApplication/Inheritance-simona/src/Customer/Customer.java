package Customer;

public class Customer {

    private Gender gender;
    private String name;
    private int age;
    private int idCust;
    private static int idGenerator = 100;

    public Customer(Gender gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.idCust = idGenerator;
        idGenerator++;

    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    
    public int getIdCust(){
        return idCust;
    }
     @Override
    public String toString(){
        return "["+idCust+","+gender+" " +name+", age: "+ age+"]";
    }
}
