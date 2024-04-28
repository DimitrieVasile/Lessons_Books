package homework_nr_11;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkNr11 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Papaya");
        fruits.add("Pear");
        fruits.add("Avocado");
        fruits.add("Persimmon");
        fruits.add("Guava");
        fruits.add("Kiwi");
        fruits.stream()
                .filter(string -> string.contains("A") && string.length() < 5)
                .forEach(System.out::println);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "Johnson", 15, true));
        personList.add(new Person("Emily", "Postolachi", 25, false));
        personList.add(new Person("Daniel", "Martinez", 29, true));
        personList.add(new Person("Olivia", "Wilson", 40, false));
        personList.add(new Person("Ethan", "Johnson", 30, true));
        personList.add(new Person("Sophia", "Pascal", 25, false));
        personList.add(new Person("Isabella", "Rodriguez", 35, true));
        personList.add(new Person("Mia", "Moore", 40, false));
        personList.add(new Person("Alex", "Anderson", 30, true));
        personList.add(new Person("Emily", "Brown", 25, false));

        List<String> maleUnder30 = personList.stream()
                .filter(person -> person.isMale() && person.getAge() < 30)
                .map(Person::getSurname)
                .toList();
        if (!maleUnder30.isEmpty()) {
            System.out.println("Men under 30 : " + maleUnder30);
        } else {
            System.out.println("No men under 30 found");
        }

        List<String> womenUnder30andSurnameStartsWithP = personList.stream()
                .filter(person -> !person.isMale() && person.getAge() < 30 && person.getSurname().startsWith("P"))
                .map(Person::getSurname)
                .findFirst()
                .stream().toList();
        if (!womenUnder30andSurnameStartsWithP.isEmpty()) {
            System.out.println("Surname women under 30 with surname starting with 'P': " + womenUnder30andSurnameStartsWithP);
        } else {
            System.out.println("No women under 30 with surname starting with 'P' found.");
        }
    }
}
