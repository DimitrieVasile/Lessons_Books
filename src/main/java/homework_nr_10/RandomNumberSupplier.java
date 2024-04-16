package homework_nr_10;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier implements Supplier<Integer> {
    private final Random random;
    public RandomNumberSupplier() {
        random = new Random();
    }
    @Override
    public Integer get() {
        return random.nextInt();
    }
    public static void main(String[] args) {
        RandomNumberSupplier randomNumberSupplier = new RandomNumberSupplier();
        int randomNum = randomNumberSupplier.get();
        System.out.println("Random number: " + randomNum);
    }
}