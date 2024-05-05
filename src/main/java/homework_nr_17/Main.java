package homework_nr_17;

public class Main {
    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();

        Thread thread1 = new Thread(alphabetPrinter::printLetters);
        Thread thread2 = new Thread(alphabetPrinter::printLetters);

        thread1.start();

        try {
            Thread.sleep(1);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        thread1.interrupt();
        thread2.start();
    }
}