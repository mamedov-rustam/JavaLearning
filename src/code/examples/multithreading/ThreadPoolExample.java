package code.examples.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Rustam Mamedov on 26.02.2015.
 */
public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4); // Try change amount of threads in pool

        System.out.println("---------- Start creating tasks ----------");
        for (int i = 1; i <= 10; i++) {
            ImportantTask task = new ImportantTask();
            System.out.println("Task-" + task.getId() + " created.");
            service.submit(task);
        }
        System.out.println("---------- All tasks have been created ----------");

        service.shutdown();
    }
}

class ImportantTask implements Runnable{
    private static int ID_COUNTER;
    private int id = ++ID_COUNTER;

    @Override
    public void run() {
        try {
            System.out.println("Task-" + id + " was started and begin his work...");
            Thread.sleep(1000);
            System.out.println("Task-" + id + " was done his work...");
        } catch (InterruptedException e) {
            System.err.println("Something go wrong with 'Task-" + id + "'!");
        }
    }

    public int getId() {
        return id;
    }
}
