
package ClothingShop;


public class T_shirt extends Cloth {
    private static double tshirtSale;
private static int countOfCloths;

    public T_shirt(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfCloths++;
        if(isOnSale())
            tshirtSale+=this.calculatePriceAfterSale();
        else tshirtSale+=this.getPrice();
    }
    public static int getCountOfCloths(){
    return countOfCloths;}
    
     public static double getTshirtSale(){
        return tshirtSale;
    }

    @Override
    public double calculatePriceAfterSale() {
return this.getPrice()*0.7;
    }
 @Override
    public void printInformation() {
        if(isOnSale())
        System.out.println("The "+this.getColor()+" T-shirt size "+this.getSize()+
        " is on sale. The original price was "+this.getPrice()+" SEK, now it is 30% off. "+
                this.calculatePriceAfterSale());
        else System.out.println("The "+this.getColor()+" T-shirt size "+this.getSize()+
        " is not on sale and the price is "+this.getPrice()+" SEK.");
    }    
}
