package code.examples.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rustam on 23.02.2015.
 */
public class SetFeature {
    static class Inner{
        private String name;

        public Inner(String name) {
            this.name = name;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Inner inner = (Inner) o;
//
//            if (name != null ? !name.equals(inner.name) : inner.name != null) return false;
//
//            return true;
//        }
//
//        @Override
//        public int hashCode() {
//            return name != null ? name.hashCode() : 0;
//        }

        @Override
        public String toString() {
            return "{ name = '" + name + "' }";
        }
    }
    public static void main(String[] args) {
        //Try uncomment comments and start it again.
        Set<Inner> set = new HashSet<>();
        System.out.println(set.add(new Inner("A")));
        System.out.println(set.add(new Inner("A")));
        System.out.println(set.add(new Inner("A")));

        System.out.println(set);
    }
}
