package homework_nr_7;

abstract public class Pensioned extends Person {
    private String retireDate;
    private int age;

    public Pensioned(String name, String surname, String retireDate, int age) {
        super(name, surname);
        this.retireDate = retireDate;
        this.age = age;
    }

    public String getRetireDate() {
        return retireDate;
    }

    public int getAge() {
        return age;
    }
}
