package CoreJava.ConcurrencyAndMultithreading;

public class WaitNotifyDemo {
    private static final Object lock = new Object();

    Thread waiter = new Thread(() -> {
        synchronized (lock) {
            try {
                System.out.println("Waitin...");
                lock.wait();
                System.out.println("Resumed...");
            } catch (InterruptedException ignored) {}
        }
    });

    Thread notifier = new Thread(() -> {
        synchronized (lock) {
            lock.notify();
            System.out.println("Notified.");
        }
    });

    waiter.start();
    try { Thread.sleep(500);} catch (Exception e) {}
    notifier.start();
}
