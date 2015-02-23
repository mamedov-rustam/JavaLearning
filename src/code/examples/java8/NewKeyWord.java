package code.examples.java8;

/**
 * Created by Rustam on 23.02.2015.
 */
public class NewKeyWord {
    public static void main(String[] args) {
        InterfaceWithDefaultMethod simple = new SimpleImpl();
        simple.sayHello();
    }
}

class SimpleImpl implements InterfaceWithDefaultMethod {}

interface InterfaceWithDefaultMethod {
    default void sayHello(){
        System.out.println("Hello from " + this.getClass().getSimpleName() + "!");
    }
}
