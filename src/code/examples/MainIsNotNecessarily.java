package code.examples;

/**
 * Created by Rustam Mamedov on 10.03.2015.
 */
public class MainIsNotNecessarily {
    static {
        System.out.println("This line was execute in class without main!");
        System.exit(0); // This was done for exception suppression "NoSuchMethodException"
    }
}
