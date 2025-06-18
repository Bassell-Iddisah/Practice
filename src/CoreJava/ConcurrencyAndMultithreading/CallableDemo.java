package CoreJava.ConcurrencyAndMultithreading;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> "Result from " + Thread.currentThread().getName();

        Future<String> future = service.submit(task);

        System.out.println("Waiting for result... ");
        String result = future.get();
        System.out.println("Result: " + result);

        service.shutdown();
    }
}
