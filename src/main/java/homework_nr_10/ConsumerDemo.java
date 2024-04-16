package homework_nr_10;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        String message = "I'm learning Java";

        Consumer<String> stringConsumer = (String str) ->{
            System.out.println("String length : "+ str.length());
            System.out.println("Upper Case: : "+ str.toUpperCase());
            System.out.println("Lower Case : "+ str.toLowerCase());
        };
        stringConsumer.accept(message);


    }
}
