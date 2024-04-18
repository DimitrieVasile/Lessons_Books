package homework_nr_10;

public class Employee {
    private String name;
    private String surname;
    private String department;
    private int age;

    public Employee(String name, String surname, String department, int age) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}
