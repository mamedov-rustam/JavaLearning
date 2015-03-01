package code.examples.oop.initialisation;

/**
 * Created by Rustam on 01.03.2015.
 */
//Пояснение: Раннее связывание, выполняемое на этапе компиляции, а позднее - во время исполнения.
public class ChoseRightMethod1 {

    public static class Parent {

        public void test() {
            System.out.println("parent::test");
        }
    }

    public static class Child extends Parent {

        public void test() {
            System.out.println("child::test");
        }
    }

    public static class Tester {

        public void test(Parent obj) {
            System.out.println("Testing parent...");
            obj.test();
        }

        public void test(Child obj) {
            System.out.println("Testing child...");
            obj.test();
        }
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        Tester t = new Tester();
        t.test(obj);
    }
}
