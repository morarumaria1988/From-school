
package ClothingShop;


public class Dress extends Cloth {
    
  private static double dressSale;
  private static int countOfCloths;

    public Dress(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfCloths++;
        if (isOnSale())
dressSale+=this.calculatePriceAfterSale();
        else dressSale+=this.getPrice();
            }
public static int getCountOfCloths(){
    return countOfCloths;
}
 public static double getDressSale(){
        return dressSale;
    }
    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice()*0.3;
    }

    @Override
    public void printInformation() {
        if(isOnSale())
        System.out.println("The "+this.getColor()+" dress size "+this.getSize()+
        " is on sale. The original price was "+this.getPrice()+" SEK, now it is 70% off. "+
                this.calculatePriceAfterSale());
        else System.out.println("The "+this.getColor()+" dress size "+this.getSize()+
        " is not on sale and the price is "+this.getPrice()+" SEK.");
    }
  
}
