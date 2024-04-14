package homework_nr_9;

public interface Animal {
    void eat();
    void sleep();
    void makeSound();
    default void walk() {
        System.out.println("The animal is walking.");
    }
    static void breathe() {
        System.out.println("The animal is breathing.");
    }
}
