package code.examples.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rustam on 23.02.2015.
 */
public class SetRemoveMethod {
    public static void main(String[] args) {
        Set<Integer> setInt = new HashSet<>();
        //If we add int all will be OK
        setInt.add(213);
        setInt.add(12);
        setInt.add(65);
        //If we add String, all will be Not Ok
        //setInt.add("bad_type_for_add");

        //If we remove int, all will be OK
        setInt.remove(45); //false;
        setInt.remove(12); //true
        //If we try remove String...
        setInt.remove("String"); // WTF compiler, where you?
    }
}
