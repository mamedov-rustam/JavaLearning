package code.examples.exception;

/**
 * Created by Rustam on 28.02.2015.
 */
public class TryFinallyReturnExample {

    public static void main(String[] args) throws Exception {
        System.out.println(getAnswer());
    }

    public static String getAnswer() {
        try {
            return "Answer return from 'try' block";
        } finally {
            return "Answer return from 'finally' block";
        }
    }
}
