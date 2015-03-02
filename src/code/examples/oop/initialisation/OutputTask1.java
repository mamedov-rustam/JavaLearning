package code.examples.oop.initialisation;

/**
 * Created by Rustam on 02.03.2015.
 */
public class OutputTask1 {
    public static void main(String[] args) {
        Test test = new Test();
    }
}

class Base {
    private int i = 5;

    public Base() {
        System.out.println("i = " + getI());
    }

    public int getI() {
        return i;
    }
}

class Test extends Base {
    private static int i = 10;

    public Test() {
        System.out.println("i = " + super.getI());
    }

    public int getI() {
        return i;
    }
}
