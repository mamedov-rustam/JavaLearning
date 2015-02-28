package code.examples.utill.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Rustam on 28.02.2015.
 */
public class Policeman implements Observer {
    private String name;

    public Policeman(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Thief){
            Thief thief = (Thief)o;
            System.out.println(name + "(policeman) grabbed " + thief.getName() + "(thief)");
        }
    }
}
