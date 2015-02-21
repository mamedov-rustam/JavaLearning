package code.examples.collection;

import java.util.*;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class LinkedListVsArrayList {
    public static final int LIST_LENGTH = 5_000_000;

    public static List<Integer> arrayList = new ArrayList<>();
    public static List<Integer> linkedList = new LinkedList<>();

    public static long startTime;
    public static long endTime;
    public static long difference;

    public static void main(String[] args) {
        for (int i = 0; i < LIST_LENGTH; i++) {
            linkedList.add(7);
            arrayList.add(7);
        }

        printStateOfCentralInsert(arrayList);
        printStateOfCentralInsert(linkedList);

        System.out.println();

        printStateOfEndInsert(arrayList);
        printStateOfEndInsert(linkedList);
    }

    public static void printStateOfCentralInsert(List list){
        startTime = new Date().getTime();
        list.add(LIST_LENGTH / 2, 5);
        endTime = new Date().getTime();

        difference = endTime - startTime;
        System.out.println("Time need to insert into center '" + list.getClass().getSimpleName() + "' is " + difference + " mils (Size: " + (list.size() - 1) + " )");
    }

    public static void printStateOfEndInsert(List list){
        startTime = new Date().getTime();
        list.add(5);
        endTime = new Date().getTime();

        difference = endTime - startTime;
        System.out.println("Time need to add to end '" + list.getClass().getSimpleName() + "' is " + difference + " mils (Size: " + (list.size() - 1) + " )");
    }
}
