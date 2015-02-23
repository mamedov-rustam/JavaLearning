package code.examples.oop.class_polimorphism;

/**
 * Created by Rustam on 23.02.2015.
 */
public class Guitar implements Vocalizer{
    @Override
    public void playSound() {
        System.out.println("Guitar play: brin brin brin");
    }
}
