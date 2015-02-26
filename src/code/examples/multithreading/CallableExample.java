package code.examples.multithreading;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * Created by Rustam on 26.02.2015.
 */
public class CallableExample {
    public static void main(String[] args) {
        // First sample of using
        ExecutorService executor = Executors.newCachedThreadPool();
        System.out.println("Starting 1-st task...");
        Future<String> future1 = executor.submit(new Task());

        // Second sample of using
        System.out.println("Starting 2-nd task...");
        FutureTask<String> future2 = new FutureTask<>(new Task());
        new Thread(future2).start();

        try {
            System.out.println(future1.get()); // 'get' method invoke is blocked current thread while task will be done.
            System.out.println(future2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.err.println("Something go wrong");
        }

        executor.shutdown();
    }
}

class Task implements Callable<String> {
    private static int ID_COUNTER;
    private int id = ++ID_COUNTER;
    @Override
    public String call() throws Exception {
        System.out.println(id + " was started...");
        Thread.sleep(3_000); // Some hard operations
        System.out.println(id + " done his operations");
        return "This value returned by Task object with id - " + id;
    }
}
