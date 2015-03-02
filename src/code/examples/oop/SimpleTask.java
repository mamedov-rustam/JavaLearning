package code.examples.oop;

/**
 * Created by Rustam on 02.03.2015.
 */
public class SimpleTask {
    public static void main(String[] args) {
        MyClass1 a = new MyClass2();
        MyClass2 b = new MyClass2();
        a.test(5);
        b.test(5);
    }
}

class MyClass1 {
    public void test(Object obj) {
        System.out.println("Object");
    }
}

class MyClass2 extends MyClass1 {
    public void test(Integer obj) {
        System.out.println("Integer");
    }
}
