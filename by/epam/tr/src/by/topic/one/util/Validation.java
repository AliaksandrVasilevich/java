package by.topic.one.util;

/**
 * Created by Aliaksandr_Vasilevic on 2/10/2017.
 */
public class Validation {
    public static boolean validDouble(String r) {
        boolean modif = false;
        try {
            Double.parseDouble(r);
            modif = true;
        } catch(NumberFormatException e) {
            // log;
        }
        return modif;
    }
    public static boolean validInt (String k) {
        boolean modif = false;
        try {
            Integer.parseInt(k);
            modif = true;
        } catch(NumberFormatException e) {
            // log;
        }
        return modif;
    }
}
