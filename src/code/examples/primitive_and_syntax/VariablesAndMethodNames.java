package code.examples.primitive_and_syntax;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class VariablesAndMethodNames {
    //public Object 1ob = new Object(); - This will not work
    //public Object @ob = new Object(); - This will not work too

    public boolean simpleVarName = true;
    public double _var = 12d;
    public int $ = 111;
    public static String можно_даже_так = "It's strangely but it work!";

    public static void simpleName(){
        System.out.println("Method/Variables can contains and start with all letters.");
    }

    public static void _my_method(){
        System.out.println("Method/Variables can start with '_'.");
    }

    public static void $(){
        System.out.println("Method/Variables can have same name($) as main jQuery's method.");
    }

    public static void printStrict(){
        System.out.println("Method/Variables CAN'T start with numbers or '@'");
    }

    public static void main(String[] args) {
        printStrict();
        simpleName();
        $();
        _my_method();
        System.out.println(можно_даже_так);
    }
}
