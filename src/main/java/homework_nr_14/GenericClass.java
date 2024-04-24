package homework_nr_14;

import java.io.Serializable;

public class GenericClass<T extends Number & Serializable> {
    private T value;


    public T getValue() {
        return value;
    }

    public void addNumber(T t) {
        this.value = t;
        System.out.println(getValue());
    }
}
