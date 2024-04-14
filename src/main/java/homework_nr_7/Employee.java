package homework_nr_7;

abstract public class Employee extends Person{
    private String companyName;

    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }
    public abstract void work();
}
