package CoreJava.ConcurrencyAndMultithreading;

public class namedThread implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is running");
    }
}
