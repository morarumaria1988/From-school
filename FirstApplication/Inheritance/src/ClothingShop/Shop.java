
package ClothingShop;

import java.util.ArrayList;

public class Shop {

    private static ArrayList<Cloth> myShop=new ArrayList<>();
     private static void initiateList(){
         myShop.add(new Dress("Red", 36, 500, true));
         myShop.add(new Dress("White", 36, 400, true));
         myShop.add(new Dress("Pink", 38, 250, false));
         myShop.add(new Dress("Purple", 38, 250, true));
         myShop.add(new T_shirt("Red", 38, 150, false));
         myShop.add(new T_shirt("Blue", 38, 150, false));
         myShop.add(new T_shirt("Yellow", 38, 150, false));
         myShop.add(new T_shirt("Brown", 38, 150, true));
         myShop.add(new T_shirt("Purple", 38, 150, true));
         myShop.add(new Pants("Blue", 36, 350, true));
         myShop.add(new Pants("Blue", 38, 350, false));
         myShop.add(new Pants("Black", 36, 400, true));
         myShop.add(new Pants("Black", 38, 400, false));
     }
    
    public static void main(String[] args) {
initiateList();
        for (Cloth c : myShop) {
            c.printInformation();
        }
        Cloth.printNumberOfCloths();
        Cloth.printTotalSale();
    }
    }
/*THE PLATE
 Imagine there is a cloth store.
 Cloths can be either:
 T-shirt
 Pants
 or Dress.
 Each Cloth has:
 Color
 Size
 and Price.
 This is a sale season so, SOME of cloths are on sale. IF a Dress is on sale it is
70% off, IF a Pants is on sale it is 50% off and IF a T-shirt is on sale it is 30% off.

REQUIREMENTS
 Create a printInformation() method that prints the information about the article
(each piece of cloth). For example, if there is a Blue, Dress, size 36 on sale it
should print:
The Blue dress size 36 is on sale. The original price was 100 SEK, now it is 70%
off. 30 SEK!
And if it is not on sale it should print:
The Blue dress size 36 is not on sale and the price is 100 SEK.
 Create a Shop class and in it ArrayList of Cloth that given below. (Table of
Cloths).
 Create a method to print information of all the Cloths in the ArrayList with loop.
 Add the method in the Cloth class to print number of all the Cloths created and
number of each type of Cloth (T-shirt, Dress and Pants) that have been created.
 Add a method in the Cloth class to print total sale of each type of Cloth (T-shirt,
Dress and Pants) and total sale (all the cloths).

IMPORTANT
Create classes considering:
 Proper encapsulation
 Inheritance
 and Polymorphism.
Table of Cloths:
Dresses
Red 36 500 SEK Sales!
White 36 400 SEK Sales!
Pink 38 250 SEK
Purple 38 250 SEK Sales!
T-shirts
Red 38 150 SEK
Blue 38 150 SEK
Yellow 38 150 SEK
Brown 38 150 SEK Sales!
Purple 38 150 SEK Sales!
Pants
Blue 36 350 SEK Sales!
Blue 38 350 SEK
Black 36 400 SEK Sales!
Black 38 400 SEK */