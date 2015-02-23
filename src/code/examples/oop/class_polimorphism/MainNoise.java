package code.examples.oop.class_polimorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rustam on 23.02.2015.
 */
public class MainNoise {
    public static void main(String[] args) {
        List<Vocalizer> vocalizerList = new ArrayList<>();

        vocalizerList.add(new Guitar());
        vocalizerList.add(new Radio());
        vocalizerList.add(new Subwoofer());

        for(Vocalizer voc : vocalizerList)
            voc.playSound();
    }
}
