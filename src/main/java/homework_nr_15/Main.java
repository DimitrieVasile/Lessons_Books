package homework_nr_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Car> carHashSet = new HashSet<>();
        carHashSet.add(new Car(1967, "Ford Mustang GT"));
        carHashSet.add(new Car(1963, "Volkswagen Beetle"));
        carHashSet.add(new Car(1969, "Chevrolet Corvette"));
        carHashSet.add(new Car(1973, "Porsche 911 Carrera"));
        carHashSet.add(new Car(1961, "Jaguar E-Type "));
        carHashSet.add(new Car(1955, "Mercedes-Benz 300SL"));
        carHashSet.add(new Car(1962, "Ferrari 250 GTO"));
        carHashSet.add(new Car(1973, "BMW 2002 Turbo"));
        carHashSet.add(new Car(1963, "Aston Martin DB5"));
        carHashSet.add(new Car(1965, "Alfa Romeo Giulia GTA"));


        TreeSet<Car> carTreeSet = new TreeSet<>(Comparator.comparing(Car::getYearMade).reversed());
        carTreeSet.addAll(carHashSet);

        System.out.println("Car HashSet");
        for (Car car : carHashSet) {
            System.out.println(car);
        }

        System.out.println("Car TreeSet");
        for (Car car : carTreeSet) {
            System.out.println(car);
        }
    }
}
