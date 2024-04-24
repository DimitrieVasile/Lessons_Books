package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD(number -> number % 2 != 0),
    CHECK_IF_POSITIVE(number -> number > 0);
    private final Predicate<Integer> predicate;

    CheckInteger(Predicate<Integer> predicate) {
        this.predicate = predicate;

    }
    public boolean testNumb(int number) {
        if (predicate != null) {
            return predicate.test(number);
        } else {
            return false;
        }
    }
}