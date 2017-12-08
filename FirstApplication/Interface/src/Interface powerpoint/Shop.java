
package powerpoint;


public class Shop {

    public static void main(String[] args) {
Food food1= new Food ("tufo", "Asian delight", 45,30);
Book book1=new Book ("Design patterns", "A tutorial on design patterns", 34, "Michael More");
Cloth cloth1=new Cloth("Cardigan","blue stripes", 35.90,38);
food1.showInfo();
book1.showInfo();
cloth1.showInfo();
        System.out.println("Price is: "+food1.price+"\n");
        System.out.println("Shipping cost for "+book1.name+" is "
        +book1.calculateCost(34)+"\n");
        System.out.println("Total cost for "+book1.name+" is: "
                +(book1.calculateCost(34)+book1.price)+"\n");
        System.out.println("Shipping cost for "+cloth1.name+" is: "+cloth1.calculateCost(4)+"\n");
    }
    
}
