package code.examples.oop;

/**
 * Created by Rustam on 02.03.2015.
 */
public class ClassCastExample2<X extends Object> {

    private X x;

    public ClassCastExample2(X x) {
        this.x = x;
    }

    public double getDouble() {
        return ((Double) x).doubleValue();
    }

    public static void main(String args[]) {
        ClassCastExample2<Integer> a = new ClassCastExample2<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }


}
