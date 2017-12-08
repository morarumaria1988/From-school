
package powerpoint;

import java.util.ArrayList;


public class Shop2 {
static ArrayList<Goods> shoppingbag=new ArrayList<>();   

    public static void main(String[] args) {
        int items=0;
Food food1= new Food ("tufo", "Asian delight", 45,30);
Book book1=new Book ("Design patterns", "A tutorial on design patterns", 34, "Michael More");
Cloth cloth1=new Cloth("Cardigan","blue stripes", 35.90,38);

shoppingbag.add(book1);
shoppingbag.add(food1);
shoppingbag.add(cloth1);
        for (Goods currentGoods : shoppingbag) {
if(currentGoods instanceof HasShippingCost){
    items++;
    System.out.println(currentGoods.name+" has a shipping cost");
}
        }
        System.out.println(items+" items has shipping cost");
    }
    
}
