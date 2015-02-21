package code.examples.multithreading;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class NotifyAndNotifyAllDifference {

    public static void main(String[] args) throws InterruptedException{
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        Thread.sleep(100);
        synchronized (MyThread.class) {
            MyThread.class.notify();  //Change to notifyAll() or uncomment next line and see what will happens
            //MyThread.class.notify();
        }

    }

    static class MyThread extends Thread{
        private static int idCounter = 1;
        private int id;

        public MyThread(){
            id = idCounter++;
        }

        @Override
        public void run() {
            try {
                synchronized (MyThread.class){
                    MyThread.class.wait();
                    System.out.println("Thread number: " + id);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
