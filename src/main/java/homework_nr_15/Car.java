package homework_nr_15;

public class Car implements Comparable<Car> {
    final int yearMade;
    final String name;

    public Car(int yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;

    }

    public Integer getYearMade() {
        return yearMade;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(o.yearMade, this.yearMade);
    }

    @Override
    public String toString() {
        return yearMade + " - " + name;
    }
}


