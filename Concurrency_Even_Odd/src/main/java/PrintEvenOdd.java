public class PrintEvenOdd {
        private int counter = 1;
        private final int max;

        public PrintEvenOdd(int max) {
            this.max = max;
        }

        public synchronized void printOdd() throws InterruptedException {
            while (counter <= max) {
                if (counter % 2 == 0) {
                    wait();
                }
                System.out.println("Odd Thread: " + counter);
                counter++;
                notify();
            }
        }

        public synchronized void printEven() throws InterruptedException {
            while (counter <= max) {
                if (counter % 2 != 0) {
                    wait();
                }
                System.out.println("Even Thread: " + counter);
                counter++;
                notify();
            }
        }
}
