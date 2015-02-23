package code.examples.multithreading;

/**
 * Created by Rustam Mamedov on 20.02.2015.
 */
public class DeadLock {
    public static Object obj1 = new Object();
    public static Object obj2 = new Object();

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new MyTask1());
        Thread t2 = new Thread(new MyTask2());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The end.");
    }
}

class MyTask1 implements Runnable{
    @Override
    public void run() {
        try {
            synchronized (DeadLock.obj1){
                System.out.println("MyTask1 start sleep");
                Thread.sleep(500);
                System.out.println("MyTask1 end sleep");
                synchronized (DeadLock.obj2){
                    System.out.println("OK for MyTask1");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyTask2 implements Runnable{
    @Override
    public void run() {
        try {
            synchronized (DeadLock.obj2){
                System.out.println("MyTask2 start sleep");
                Thread.sleep(500);
                System.out.println("MyTask2 end sleep");
                synchronized (DeadLock.obj1){
                    System.out.println("OK for MyTask2");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
