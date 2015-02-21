package code.examples.exception;

/**
 * Created by Rustam Mamedov on 21.02.2015.
 */
public class CaughtUncaughtExceptionsAndErrors {
    public static void main(String[] args) {
        try{
            throw new CaughtException();
        }catch (CaughtException e){
            System.err.println(e.getMessage() + "\n\n");
        }

        // Change 'true' to 'false' if you want to see 'UncaughtError'
        if(true){
            throw new UncaughtException();
        }else
            throw new UncaughtError();

    }
}

class CaughtException extends Exception{
    @Override
    public String getMessage() {
        return "This is 'CaughtException' which we have to caught in 'catch' block after 'try' block.";
    }
}

class UncaughtException extends RuntimeException{
    @Override
    public String getMessage() {
        return "This is 'UncaughtException' which we can caught or not caught, but will be better if we not caught it.";
    }
}

class UncaughtError extends Error{
    @Override
    public String getMessage() {
        return "This is 'CaughtError' which we can caught or not caught, but will be better if we not caught it.";
    }
}


