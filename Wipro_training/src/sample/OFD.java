package sample;

import java.util.concurrent.*;

class Order implements Runnable {
    private int orderId;

    Order(int id) {
        this.orderId = id;
    }

    public void run() {
        System.out.println("Processing Order " + orderId + " by " + Thread.currentThread().getName());
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("Completed Order " + orderId);
    }
}

public class OFD {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3); // 3 delivery agents

        for (int i = 1; i <= 10; i++) {
            pool.execute(new Order(i));
        }

        pool.shutdown();
    }
}