package homework_nr_3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        System.out.println("\nЧисла от 100 до 1000, которые делятся на 5:");
        for (int a = 100; a <= 1000; a++) {
            if (a % 5 == 0) {
                System.out.println(a);
            }

        }
        // Выводим каждый элемент серии и добавляем его к сумме
        double sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            double currentT = (double) i / (i + 2);
            System.out.println(currentT);
            sum += currentT;
            

        }
    }
}
