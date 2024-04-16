package homework_nr_10;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * 2;
            }
        };

        int inputNumber = 1;
        int result = multiplyByTwo.apply(inputNumber);

        System.out.println(result);
    }
}
