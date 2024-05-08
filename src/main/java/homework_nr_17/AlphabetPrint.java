package homework_nr_17;

class AlphabetPrinter {
    public synchronized void printLetters() {
        for (char az = 'a'; az <= 'z'; az++) {
            System.out.print(az + " ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException exception) {
                System.out.println("Thread interrupted !");
                return;
            }
        }
        System.out.println();
    }
}


