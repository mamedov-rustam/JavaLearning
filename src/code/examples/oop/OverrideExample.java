package code.examples.oop;

/**
 * Created by Rustam on 27.02.2015.
 */
public class OverrideExample {
    public static void main(String[] args) {
        Parent a = new Child();
        a.print();
    }
}

class Parent {
    public String str = "Parent string";

    public void print() {
        System.out.println(str);
    }
}

class Layer extends Parent {
    private String str = "Layer string";
}

class Child extends Layer {
    public String str = "Child string";

    Child() {
        System.out.println(((Parent) this).str);
        System.out.println(str);
    }

    @Override
    public void print() {
        System.out.println(str);
    }
}
