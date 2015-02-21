package code.examples.exception;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class UncaughtExceptionHandlerExample implements Thread.UncaughtExceptionHandler{
    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandlerExample());
        throw new RuntimeException();
        //System.out.println("Hello");   --- Unreachable statement
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println("On this place we can handle uncaught exception.");
    }
}
