package homework_nr_8;

import java.util.HashMap;
import java.util.Map;

public class EnglishRussianDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("banana", "банан");
        dictionary.put("cat", "кот");
        dictionary.put("house", "дом");
        dictionary.put("moon", "луна");
        dictionary.put("book", "книга");
        dictionary.put("tree ", "Дерево");
        dictionary.put("water ", "Вода");
        dictionary.put("dog ", "собака");
        dictionary.put("sun ", "солнце");
        dictionary.put("computer", "компьютер");

        System.out.println("English - Russian Dictionary : ");
        System.out.println("******************************");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
