package DayTwo;

class Person {

    private String name;

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void writeName() {

        System.out.println("My name is " + name);
    }

}

public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person("Maria");
        String name = person.getName();
        name = name + " Olsson";
        person.setName(name);
        person.writeName();
    }

}
