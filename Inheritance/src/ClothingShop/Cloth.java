
package ClothingShop;

public abstract class Cloth {
    private String color;
    private int size;
    private double price;
    private boolean onSale;
    private static int countOfCloths;
    private static double totalSale;

    public Cloth(String color, int size, double price, boolean onSale) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.onSale = onSale;
        countOfCloths++;
        if(isOnSale())
            totalSale+=this.calculatePriceAfterSale();
        else totalSale+=this.getPrice();
    } 
    public static int getCountOfCloths(){
        return countOfCloths;
    }
    public static double getTotalSale(){
        return totalSale;
    }
    public boolean isOnSale() {
        return onSale;
    }
    public double getPrice() {
        return price;
    }
    public String getColor(){
        return color;
    }
    public int getSize(){
        return size;
    }
    public abstract double calculatePriceAfterSale();
    public abstract void printInformation();
    public static void printNumberOfCloths(){
        System.out.println("Total number of cloths are: "+Cloth.getCountOfCloths());
        System.out.println("Total number of T-shirts are: "+T_shirt.getCountOfCloths());
        System.out.println("Total number of dresses are: "+Dress.getCountOfCloths());
        System.out.println("Total number of pants are: "+Pants.getCountOfCloths());
    }
   public static void printTotalSale(){
       System.out.println("The total sale of cloths are "+getTotalSale());
       System.out.println("The total sale of dresses are "+Dress.getDressSale());
       System.out.println("The total sale of t-shuirts are "+T_shirt.getTshirtSale());
       System.out.println("The total sale of pants are "+Pants.getpantsSale());
   }
    
}
