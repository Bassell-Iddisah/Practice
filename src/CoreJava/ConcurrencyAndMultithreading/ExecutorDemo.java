package CoreJava.ConcurrencyAndMultithreading;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Runnable task = () -> System.out.println("Running in " + Thread.currentThread().getName());

        service.execute(task);
        service.execute(task);

        service.shutdown();
    }
}
