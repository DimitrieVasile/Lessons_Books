package homework_nr_17;

public class Main {
    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();

        Thread thread1 = new Thread(() -> alphabetPrinter.printLetters());
        Thread thread2 = new Thread(() -> alphabetPrinter.printLetters());

        thread1.start();
        thread2.start();


        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
    }
}