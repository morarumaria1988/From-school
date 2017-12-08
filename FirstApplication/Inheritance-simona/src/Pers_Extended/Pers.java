
package Pers_Extended;

public abstract class Pers {
    private int age;
    private String name;
    private String address;
    private int idPerson;
    private static int idGenerator=1;
    
    public Pers(){}
    
    public Pers(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
        this.idPerson=idGenerator;
        idGenerator++;
        
    }
//    implemented meth in Children:
    
    public abstract double bonus();
    
    public int getId() {
    		return idPerson;
    }
    
    public String getName(){
    return name;
}
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
        return (idPerson+" "+name+",address:"+address );
    }
}
