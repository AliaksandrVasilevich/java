package by.topic.one.util;

import by.topic.one.mathematics.NumberSumma;

/**
 * Created by Aliaksandr_Vasilevic on 2/20/2017.
 */
public class CreateNumber {
    public static int create () {
        String st;
        boolean c;
        st = FileAction.readFile();
        c = Validation.validInt(st);
        if (!c) {
            System.out.println("Text file consist not Integer value");
            return 0;
        }
        return NumberSumma.summa(Integer.parseInt(st));

    }
}
