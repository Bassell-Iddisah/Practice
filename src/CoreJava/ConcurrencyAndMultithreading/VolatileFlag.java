package CoreJava.ConcurrencyAndMultithreading;

public class VolatileFlag {
    private static volatile boolean running = true;

//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(() -> {
//           while (running) {}
//           System.out.println("Stopped");
//        });
//
//        t.start();
//        Thread.sleep(1000);
//        running = false;
//    }
}
