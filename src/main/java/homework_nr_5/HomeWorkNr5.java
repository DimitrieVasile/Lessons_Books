package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i <= 100; i++) {
            numbers[i] = 100 - i;
        }
        for (int i = 0; i <= 100; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(" ");
        }
        int sum = 0;
        long prod = 1;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            } else {
                prod *= number;
            }
        }
        System.out.println("Sum of even elements: " + sum);
        System.out.println("Product of odd elements: " + prod);

        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        System.out.println("******** Verify if elements are copied *******");
        for (int number : copyNumbers){
            System.out.println(number + " ");
        }
    }

}
