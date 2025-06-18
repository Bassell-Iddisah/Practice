package CoreJava.ConcurrencyAndMultithreading;

public class SyncBlockDemo {
    private final Object lock = new Object();
    private int count = 0;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }
}
