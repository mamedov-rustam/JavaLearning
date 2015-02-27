package code.examples.oop;

/**
 * Created by Rustam on 27.02.2015.
 */
public class AmbiguousProblem {
    public static void main(String[] args) {
        // System.out.println(ABImpl.text); - we can't do this
        System.out.println(((A) new ABImpl()).text);
        System.out.println(((B) new ABImpl()).text);
    }
}

interface A {
    String text = "a";
}

interface B {
    String text = "b";
}

class ABImpl implements A, B {}
