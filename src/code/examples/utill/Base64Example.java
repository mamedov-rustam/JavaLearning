package code.examples.utill;

import java.util.Base64;

/**
 * Created by Rustam Mamedov on 26.02.2015.
 */
public class Base64Example {
    public static void main(String[] args){
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();

        String msg = "Hello world with Base64!";
        System.out.println("Start string: '" + msg + "'");

        byte[] encodeBytes = encoder.encode(msg.getBytes());
        String encodeString = new String(encodeBytes);
        System.out.println("Encode string: '" + encodeString + "'");

        byte[] decodeBytes = decoder.decode(encodeBytes);
        String decodeString = new String(decodeBytes);
        System.out.println("Decode string: '" + decodeString + "'");
    }
}
