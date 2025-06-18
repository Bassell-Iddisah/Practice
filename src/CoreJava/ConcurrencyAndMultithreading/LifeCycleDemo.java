package CoreJava.ConcurrencyAndMultithreading;

public class LifeCycleDemo implements Runnable {

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {}
    }
}
