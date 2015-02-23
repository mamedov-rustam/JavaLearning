package code.examples.oop.class_polimorphism;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Radio implements Vocalizer {
    @Override
    public void playSound() {
        System.out.println("Radio play: la la la la la");
    }
}
