package module;
/**
 * This class create a object Artist to be use in the Artist Management system
 * 
 * @author Mariela Tanya Maria
 */
public class Artist {
    
    private int id;
    private String name;
    private String lastName;
    private int age;
    
    /**
     * Create a Artist from the data base
     * @param id
     * @param name
     * @param lasName
     * @param age 
     */
    public Artist(int id, String name, String lasName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lasName;
        this.age = age;
    }
    
    /**
     * Create a Artist for the first time to be inserted in the data base
     * the id is auto incremented in the table.
     * @param name
     * @param lasName
     * @param age 
     */    
    public Artist( String name, String lasName, int age) {
        this.name = name;
        this.lastName = lasName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLasName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
