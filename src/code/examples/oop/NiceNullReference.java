package code.examples.oop;

/**
 * Created by Rustam on 27.02.2015.
 */
public class NiceNullReference {
    public static String mind = "This is very strangely...";

    public static void main(String[] args) {
        NiceNullReference nullRef = null;
        System.out.println(nullRef.mind);
        nullRef.print();
    }

    public static void print(){
        System.out.println("This is a miracle!");
    }
}
