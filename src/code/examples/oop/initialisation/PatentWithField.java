package code.examples.oop.initialisation;

/**
 * Created by Rustam on 01.03.2015.
 */
public class PatentWithField {
    int x = 2;

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        PatentWithField c = new SubClass();
        System.out.println(c.x + " " + c.getX());
    }
}

class SubClass extends PatentWithField {
    int x = 1;

    public int getX() {
        return x;
    }
}