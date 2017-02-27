package by.topic.one.mathematics;

/**
 * Created by Aliaksandr_Vasilevic on 2/20/2017.
 */
public class NumberSumma {
    public static int summa (int k) {
        int i = 0;
        int j = 0;
        String t;
        String p = String.valueOf(k);
        do {
            t = p.substring(i, i+1);
            j += Integer.parseInt(t);
            i += 1;
        } while (i != p.length());

        return j;
    }

}
