package homework_nr_14;

public class Main {
    public static void main(String[] args) {


        System.out.println("Integer");
        GenericClass<Integer> genericClassInteger = new GenericClass<>();
        genericClassInteger.addNumber(1);
        genericClassInteger.addNumber(15);
        genericClassInteger.addNumber(22);

        System.out.println("Float");
        GenericClass<Float> genericClassFloat = new GenericClass<>();
        genericClassFloat.addNumber(1.5f);
        genericClassFloat.addNumber(15.9f);
        genericClassFloat.addNumber(22.5f);

        System.out.println("Double");
        GenericClass<Double> genericClassDouble = new GenericClass<>();
        genericClassDouble.addNumber(55.9d);
        genericClassDouble.addNumber(22.8d);
        genericClassDouble.addNumber(33.8d);


    }

}
