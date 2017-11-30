
package InterfaceExercise;

public class SummerDiscountStrategy implements DiscountStrategy {

    @Override
    public long priceByDiscount(Clothing clothing) {
long price=clothing.getBasePrice();
if(clothing.getSeason().equals(Season.SPRING))
    return (long) (price*0.6);
else if (clothing.getSeason().equals(Season.SUMMER))
    return (long) (price*0.5);
else if (clothing.getSeason().equals(Season.WINTER))
    return (long) (price*0.7);
else return price;
    }
}
