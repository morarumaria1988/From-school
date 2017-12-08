
public class Ex7 {
    public static void main(String[] args) {
        Person p = new Person("Maria");
        p.setAge(29);
        p.setGender('F');
        System.out.println(p);
        System.out.println("My name is "+p.getName()+", I am "+p.getGender()+" and I am "+p.getAge()+" years old.");
    }
}
class Person {

    private String name;
    private int age;
    private char gender; //male == 'M' , female == 'F'

    Person(String name) {
        this.name = name;
    }
    

   void setAge(int age) {
        this.age = age;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    char getGender() {
        return gender;
    }

    String getName() {
        return name;
    }

    
    public String toString() {
        return ("Name: " + name
                + ", Age: " + age + ", Gender: " + gender);
    }

}