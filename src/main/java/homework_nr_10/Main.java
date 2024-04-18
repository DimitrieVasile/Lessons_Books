package homework_nr_10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasile", "Dimitriev", "Software Engineering", 31);
        Predicate<Employee> employeeFilter = e -> e.getDepartment().equals("Software Engineering")
                && e.getAge() > 20
                && e.getName().startsWith("A");
        testEmployee(employee, employeeFilter);

        Supplier<Integer> randomSuplimer = () -> new Random().nextInt(1000);
        System.out.println("Number randomSupplier : " + randomSuplimer.get());

        Predicate<Integer> oddNumber = num -> num % 2 != 0;
        Consumer<String> printCon = System.out::println;

        Function<Integer, Integer> multiply = num -> num * 2;
        int saveVariableRandom = randomSuplimer.get();

        System.out.println("Is " + saveVariableRandom + " odd number ? --> " + oddNumber.test(saveVariableRandom));
        printCon.accept("Attention ! Multiply method");
        System.out.println(saveVariableRandom + " x 2 = " + multiply.apply(saveVariableRandom));
    }


}
