package code.examples.multithreading;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class SynchronizedCounter {
    //Try run this programme about ten times and look to output
    public static void main(String[] args) throws InterruptedException{
        Thread nonSyncTask1 = new Thread(new NonSyncCountTask());
        Thread nonSyncTask2 = new Thread(new NonSyncCountTask());

        nonSyncTask1.start();
        nonSyncTask2.start();

        nonSyncTask1.join();
        nonSyncTask2.join();

        System.out.println("Expected - 2000000 : Really - " + NonSyncCountTask.count);

        Thread syncTask1 = new Thread(new SyncCountTask());
        Thread syncTask2 = new Thread(new SyncCountTask());

        syncTask1.start();
        syncTask2.start();

        syncTask1.join();
        syncTask2.join();

        System.out.println("Expected - 2000000 : Really - " + SyncCountTask.count);
    }
}

class NonSyncCountTask implements Runnable{
    static int count;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
    }
}

class SyncCountTask implements Runnable{
    static int count;

    @Override
    public void run() {
        synchronized (SyncCountTask.class){
            for (int i = 0; i < 1_000_000; i++) {
                count++;
            }
        }
    }
}
