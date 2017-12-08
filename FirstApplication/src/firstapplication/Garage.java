package firstapplication;

import java.util.ArrayList;

public class Garage {

    ArrayList<Car> garage = new ArrayList<>();

    public void addToGarage(Car c) {
        garage.add(c);
    }

    public void removeFromGarage(Car c) {
        garage.remove(c);
    }

    public void showAllCars() {
        for (Car car : garage) {
            System.out.println(car);
        }
    }

   
}
