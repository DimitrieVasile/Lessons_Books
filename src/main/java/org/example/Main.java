package org.example;

import homework_nr_7.Manager;
import homework_nr_7.Person;
import homework_nr_7.Programmer;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Jack", "Nicholson", "QA-PRO", 75, "Development");
        Programmer programmer = new Programmer("Bill", "Istvan", "OCTAM VISION", "Java", 10);

        Person[] people = {manager, programmer};
        for (Person person : people) {
            if ( person instanceof Programmer) {
                ((Programmer) person).work();
            }
        }

    }

}