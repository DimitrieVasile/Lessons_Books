package homework_nr_6;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
       Employee employee = new Employee("Andrey",30,"IT");
       Invoice invoice = new Invoice("Maxbook","M3",2,980);
       Date date = new Date(15,10,2024);

// 1
        System.out.println("Amount: "+invoice.getAmount()+" $");

        // 2

        date.DisplayDate();


    }

}
