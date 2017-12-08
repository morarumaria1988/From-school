package InterfaceExercise;

public class Main {

    public static void main(String[] args) {
        Jacket linenCoat = new Jacket("Linen Coat", Season.FALL, 100000);
        System.out.println("Linen Coat: " + linenCoat.getPrice());
        linenCoat.setDiscountStrategy(new BlackFridayDiscountStrategy());
        System.out.println("Linen Coat wih BlackFriday discount: " + linenCoat.getPrice());
        linenCoat.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Linen Coat with Winter discount: "+linenCoat.getPrice());
        
        Clothing woolenSocks=new Pants("Woolen Socks", Season.WINTER, 10000);
        System.out.println("Woolen socks: "+woolenSocks.getPrice());
        woolenSocks.setDiscountStrategy(new SummerDiscountStrategy());
        System.out.println("Woolen socks with Summer discount: "+woolenSocks.getPrice());
        woolenSocks.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Woolen socks with Winter discount: "+woolenSocks.getPrice());
    }

}
