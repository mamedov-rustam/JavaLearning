package code.examples.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rustam Mamedov on 26.02.2015.
 */
public class SimpleData {
    private static SimpleDateFormat format1 = new SimpleDateFormat("EEE, MMM d, ''yy");
    private static SimpleDateFormat format2 = new SimpleDateFormat("h:mm a");
    private static SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    private static SimpleDateFormat format4 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
    private static SimpleDateFormat format5 = new SimpleDateFormat("hh 'o''clock' a, zzzz");

    public static void main(String[] args) {
        Date date = new Date(); // Now

        System.out.println(format1.format(date));
        System.out.println(format2.format(date));
        System.out.println(format3.format(date));
        System.out.println(format4.format(date));
        System.out.println(format5.format(date));
    }
}
