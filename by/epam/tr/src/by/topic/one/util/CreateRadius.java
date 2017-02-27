package by.topic.one.util;

import by.topic.one.print.request.DoubleRequest;
import by.topic.one.print.error.DoubleWrong;

/**
 * Created by Aliaksandr_Vasilevich on 2/12/2017.
 */
public class CreateRadius {
    public static double create() {
        String p;
        double r = 0;
        boolean c;
        do {
            DoubleRequest.request(); //Enter the radius of the circle
            KeyReadder rd = new KeyReadder();
            p = rd.read();
            c = Validation.validDouble(p); //validation
            if (c) {
                r = Double.parseDouble(p);
            }
        } while (!c);

//        if (c) {
//                r = Double.parseDouble(p);
//            } else {
//                DoubleWrong.wrong();
//                System.exit(0);
//            }
        return r;

    }

}

