package firstapplication;

public class Car {

    private String model;
    private double price;
    private String color;

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color +  ", price=" + price +"}";
    }

    public Car(String model, double price,String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
