package homework_nr_6;

public class Employee {
    private String name;
    private int age;
    private String departament;

    public Employee(String name, int age, String departament) {
        this.name = name;
        this.age = age;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}

