package CoreJava.ConcurrencyAndMultithreading;

public class myRunnable implements Runnable{
    private String runnableNumber;

    public myRunnable(String runnableNumber) {
        this.runnableNumber = runnableNumber;
    }

    public void run() {
        System.out.println("Hello from myRunnable " + this.runnableNumber);
    }
}
