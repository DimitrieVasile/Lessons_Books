package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        Predicate<Integer> predicate1 = integer -> integer % 2 != 0;
        System.out.println("The number is odd : ");
        for (Integer number : numbers){
            if (predicate1.test(number)){
                System.out.println(number);
            }
        }

    }
}
