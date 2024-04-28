package homework_nr_11;

class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isMale;

    public Person(String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }
}
