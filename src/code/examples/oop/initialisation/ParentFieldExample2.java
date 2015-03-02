package code.examples.oop.initialisation;

/**
 * Created by Rustam on 01.03.2015.
 */
public class ParentFieldExample2 {
    int x = 2;

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        ParentFieldExample2 c = new SubClass();
        System.out.println(c.x + " " + c.getX());
    }
}

class SubClass extends ParentFieldExample2 {
    int x = 1;

    public int getX() {
        return x;
    }
}