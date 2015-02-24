package code.examples.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by Rustam on 24.02.2015.
 */
public class CollectionForEach {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(9);

        collection.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer + "^2 = " + integer * integer);
            }
        });
    }
}
