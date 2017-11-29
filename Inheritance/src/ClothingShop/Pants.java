
package ClothingShop;
 
public class Pants extends Cloth{
private static int countOfCloths;
private static double pantsSale;
    public Pants(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        if(isOnSale())
            pantsSale+=this.calculatePriceAfterSale();
        else pantsSale+=this.getPrice();
    }
public static double getpantsSale(){
    return pantsSale;}
public static int getCountOfCloths(){
    return countOfCloths;}
    @Override
    public double calculatePriceAfterSale() {
return this.getPrice()*0.5;
    }
    @Override
    public void printInformation() {
        if(isOnSale())
        System.out.println("The "+this.getColor()+" pants size "+this.getSize()+
        " is on sale. The original price was "+this.getPrice()+" SEK, now it is 50% off. "+
                this.calculatePriceAfterSale());
        else System.out.println("The "+this.getColor()+" pants size "+this.getSize()+
        " is not on sale and the price is "+this.getPrice()+" SEK.");
    } 
    
}
