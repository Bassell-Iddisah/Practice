package CoreJava.ConcurrencyAndMultithreading;

public class thread extends Thread {
    private String threadNumber;

    public thread(String threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Hello World from thread " + this.threadNumber);
    }
}
