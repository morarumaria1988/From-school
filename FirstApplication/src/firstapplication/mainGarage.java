
package firstapplication;

public class mainGarage {
    public static void main(String[] args) {
        Car car1=new Car("Mercedes",150000,"black");
        Car car2=new Car("Citroen",79000,"blue");
        Garage ourGarage=new Garage();
        ourGarage.addToGarage(car1);
        ourGarage.addToGarage(car2);
        ourGarage.showAllCars();
    }
}
