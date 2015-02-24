package code.examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Rustam on 24.02.2015.
 */
public class CollectionRemoveIf {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(123);
        intList.add(324);
        intList.add(234);
        intList.add(678);
        intList.add(234);
        intList.add(1345);

        System.out.println(intList);
        intList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 500;
            }
        });
        System.out.println(intList);
    }
}
