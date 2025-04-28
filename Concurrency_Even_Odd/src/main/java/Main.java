public class Main {
    public static void main(String[] args){
        // create a shared object
        State state = new State("EVEN");
        Printer odd = new Printer(state, 0, 20, "EVEN");
        Printer even = new Printer(state, 1, 20, "ODD");

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t2.start();

        // using single object

        int max = 10;
        PrintEvenOdd printer = new PrintEvenOdd(max);

        Thread oddThread = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread evenThread = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

}
