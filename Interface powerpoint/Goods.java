package powerpoint;

public class Goods {

    String name;
    double price;
    String description;

    Goods(String name, String description, double price) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    void showInfo() {
           System.out.println(name + " " + description + " " + price);
    }
}

interface HasShippingCost {

    double COSTPERMILE = 2.1;
    double calculateCost(double distance);
}

class Food extends Goods {

    double weight;

    Food(String name, String description, double price, double weight) {
        super(name, description, price);
        this.weight = weight;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(weight);
    }
}

class Cloth extends Goods implements HasShippingCost {

    int size;

    public Cloth(String name, String description, double price, int size) {
        super(name, description, price);
        this.size=size;
    }
    @Override
 void showInfo() {
     super.showInfo();
     System.out.println(size);
 }
    @Override
    public double calculateCost(double distance) {
        return (COSTPERMILE/2) * distance;
    }
}

class Book extends Goods implements HasShippingCost {
    String author;

    public Book(String name, String description, double price, String author) {
        super(name, description, price);
        this.author=author;
    }
    @Override
     void showInfo() {
         super.showInfo();
         System.out.println(author);
     }
@Override
    public double calculateCost(double distance) {
        return COSTPERMILE * distance;
    }
}
