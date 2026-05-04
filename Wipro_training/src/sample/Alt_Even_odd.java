package sample;

class NumberPrinter {
    private int num = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (num <= MAX) {
            if (num % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (num <= MAX) {
            if (num % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }
}

public class Alt_Even_odd {
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}