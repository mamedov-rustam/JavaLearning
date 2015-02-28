package code.examples.utill.observer;

import java.util.Observable;

/**
 * Created by Rustam on 28.02.2015.
 */
public class Thief extends Observable {
    private String name;

    public Thief(String name){
        this.name = name;
    }

    public void commitCrime(){
        System.out.println(name + "(thief) committed a crime.");
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return name;
    }
}
