package InterfaceExercise;

public class BlackFridayDiscountStrategy implements DiscountStrategy {

    @Override
    public long priceByDiscount(Clothing clothing) {
        long newPrice = clothing.getBasePrice();
        /*  if (clothing instanceof Jacket) {
            return (long) (newPrice * 0.90);
        } else if (clothing instanceof Socks) {
            return (long) (newPrice * 0.80);
        } else {
            return (long) (newPrice * 0.75);
              }*/
        if (clothing instanceof Jacket) {
            newPrice = (long) (newPrice * 0.9);
        } else if (clothing instanceof Socks) {
            newPrice = (long) (newPrice * 0.8);
        } else {
            newPrice = (long) (newPrice * 0.75);
        }

        return newPrice;
    }

}
