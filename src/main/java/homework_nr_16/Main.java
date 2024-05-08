package homework_nr_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/main/java/homework_nr_16/input.txt";
        String outputFileName = "src/main/java/homework_nr_16/output.txt";
        List<Person> personList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String ln;
            while ((ln = reader.readLine()) != null) {
                String[] parts = ln.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    double score = Double.parseDouble(parts[2].trim());
                    Person person = new Person(name, age, score);
                    personList.add(person);
                } else {
                    System.out.println("Invalid data format " + ln);
                }
            }
            double totalScore = 0;
            for (Person person : personList) {
                totalScore += person.getScore();
            }
            double averageScore = totalScore / personList.size();
            System.out.println("Average Score : " + averageScore);

            Person young = personList.get(0);
            Person old = personList.get(0);
            for (Person person : personList) {
                if (person.getAge() < young.getAge()) {
                    young = person;
                }
                if (person.getAge() > old.getAge()) {
                    old = person;
                }
            }
            System.out.println("Young person: " + young.getName() + " ,Age: " + young.getAge());
            System.out.println("Old person: " + old.getName() + " ,Age: " + old.getAge());

            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
                writer.println("Average score : " + averageScore);
                writer.println("Young person : " + young.getName() + " (" + young.getAge() + ")");
                writer.println("Old person : " + old.getName() + " (" + old.getAge() + ")");
            } catch (IOException exception) {
                System.out.println("Error writing file: " + exception.getMessage());
            }
        } catch (IOException | NumberFormatException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }
    }
}
