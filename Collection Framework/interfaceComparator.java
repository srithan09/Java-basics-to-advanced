import java.util.*;

class Car implements Comparator<Car> {
    String company;
    String engine;
    Car(String company, String engine) {
        this.company = company;
        this.engine = engine;
    }
    @Override
    public int compare(Car c1, Car c2) {
        return c1.engine.compareTo(c2.engine);
    }
    @Override
    public String toString() {
        return company + " - " + engine;
    }
}

public class interfaceComparator {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Electric"));
        cars.add(new Car("Ford", "V8"));
        cars.add(new Car("Toyota", "Hybrid"));
        cars.add(new Car("Honda", "i-VTEC"));
        Car carComparator = new Car("", "");
        Collections.sort(cars, carComparator.reversed());
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
