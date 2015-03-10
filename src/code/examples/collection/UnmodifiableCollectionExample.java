package code.examples.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Rustam Mamedov on 10.03.2015.
 */
public class UnmodifiableCollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" ");
        list.add("world");

        list.forEach(System.out::print);

        list = Collections.unmodifiableList(list);

        list.add("!!!");
        list.forEach(System.out::print);
    }
}
