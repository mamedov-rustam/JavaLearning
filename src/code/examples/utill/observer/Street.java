package code.examples.utill.observer;

/**
 * Created by Rustam on 28.02.2015.
 */
public class Street {
    public static void main(String[] args) {
        Policeman policeman = new Policeman("Johny Bravo");
        Thief thief = new Thief("Tony Montana");
        thief.addObserver(policeman);

        thief.commitCrime();
    }
}
