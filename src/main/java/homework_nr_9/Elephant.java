package homework_nr_9;

public class Elephant extends Erbivor implements Animal {

    @Override
    public void eat() {
        System.out.println("Elephant is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting.");
    }

    @Override
    void drinkWater() {
        System.out.println("Elephant is drink water");

    }
}