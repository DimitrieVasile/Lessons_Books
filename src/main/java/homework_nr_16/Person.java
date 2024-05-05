package homework_nr_16;

public class Person {
    final private String name;
    final private int age;
    final private double score;

    public Person(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}
