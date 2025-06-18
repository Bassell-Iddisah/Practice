public class Main {
    public static void main(String[] args) {

        // Starting new thread with Thread class
//        thread FirstThread = new thread("1");
//        thread SecondThread = new thread("2");
//        FirstThread.start();
//        SecondThread.start();

        // Starting new thread with Runnable interface
//        Thread t1 = new Thread(new myRunnable("1"));
//        Thread t2 = new Thread(new myRunnable("2"));
//        t1.start();
//        t2.start();

        // Naming and Controlling Threads [sleep() & join()]
//        Thread t1 = new Thread(new namedThread(), "Worker 1");
//        t1.start();
//        t1.join();
//
//        System.out.println("Hello from main thread");
//        System.out.println("Main thread finished");

        // Thread States and Lifecycles
        // States: NEW, RUNNABLE, BLOCKED, WAITING, TIMED/WAITING, TERMINATED
//        Thread t = new Thread(new LifeCycleDemo());
//        System.out.println("Before start: " + t.getState());
//        t.start();
//        System.out.println("After start: " + t.getState());
//        Thread.sleep(1000);
//        System.out.println("During sleep: " + t.getState());
//        t.join();
//        System.out.println("After termination: " + t.getState());

        // Thread Pools with ExecutorService

        // Submitting Callable Tasks with Future

        // Basic synchronization with 'synchronized'
//        Counter counter = new Counter();
//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++)
//                counter.increment();
//        };
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//
//        t1.start(); t2.start();
//        t1.join(); t2.join();
//
//        System.out.println("Final count: " + counter.getCount());
        // VISIBILITY WITH VOLATILE

        // USING REENTRANTLOCK
        System.out.println("Done");
    }
}
