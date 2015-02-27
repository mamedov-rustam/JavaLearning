package code.examples.java8;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Rustam on 27.02.2015.
 */
public class FunctionalInterfaceImplWithLambda {
    public static void main(String[] args) {
        Set<SimpleObject> set = new TreeSet<SimpleObject>((o1, o2) -> o1.getValue()- o2.getValue());

        set.add(new SimpleObject(3));
        set.add(new SimpleObject(4));
        set.add(new SimpleObject(1));
        set.add(new SimpleObject(5));
        set.add(new SimpleObject(2));

        set.forEach(System.out::println);
    }
}

class SimpleObject {
    private int value;

    public SimpleObject(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleObject with value = " + value;
    }

    public int getValue() {
        return value;
    }
}
