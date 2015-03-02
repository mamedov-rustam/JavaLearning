package code.examples.oop.initialisation;

/**
 * Created by Rustam on 02.03.2015.
 */
public class ClassInitExample {
    public static void main(String... args) {
        CC c = new CC();

    }

}

class AA {
    static {
        System.out.print("1");
    }

    AA() {
        System.out.print("2");
    }

    AA(String str) {
        this();
        System.out.print("3");
    }
}

class BB extends AA {
    static {
        System.out.print("4");
    }

    BB() {
        System.out.print("5");
    }

    BB(String str) {
        this();
        System.out.print("6");
    }
}

class CC extends BB {
    static {
        System.out.print("7");
    }

    {
        System.out.print("8");
    }

    CC() {
        super("Hello");
        System.out.print("9");
    }
}
