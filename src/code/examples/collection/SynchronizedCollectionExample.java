package code.examples.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Rustam Mamedov on 10.03.2015.
 */
public class SynchronizedCollectionExample {
    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException{
        fillList(list);
        Thread.sleep(20);
        System.out.println("Unsync list size = " + list.size());
        System.out.println(list);

        fillList(syncList);
        Thread.sleep(20);
        System.out.println("\nSync list size = " + list.size());
        System.out.println(syncList);
    }

    public static void fillList(List<Integer> list){
        for (int i = 1; i <= 100; i++) {
            final int iCopy = i;
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                    list.add(iCopy);
                } catch (InterruptedException e) {}
            }).start();
        }
    }
}
