package by.topic.one;

import by.topic.one.entity.Circle;
import by.topic.one.print.CirclePrint;
import by.topic.one.util.*;
import by.topic.one.mathematics.MathCircle;

/**
 * Created by Aliaksandr_Vasilevich on 2/9/2017.
 */

public class FirstMathAction {

    public static void main(String[] args) {

        //circle
        Circle circle = new Circle();
        CreateRadius cr = new CreateRadius();
        circle.setRadius(cr.create());
        CirclePrint.lengthWrite(MathCircle.circleArea(circle.getRadius()));
        CirclePrint.areaWrite(MathCircle.circleLength(circle));

        //sum4
        int a = CreateNumber.create();
        FileAction.writeFile(String.valueOf(a));
        System.out.println(a);
    }
}
