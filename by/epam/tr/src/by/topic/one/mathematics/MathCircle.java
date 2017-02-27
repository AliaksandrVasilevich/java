package by.topic.one.mathematics;

import by.topic.one.entity.Circle;

/**
 * Created by Aliaksandr_Vasilevich on 2/12/2017.
 */
public class MathCircle {

    public static double circleLength(final double x) {
        return 2 * x * Math.PI;
    }

    public static double circleLength(final Circle circle) {

        return 2 * circle.getRadius() * Math.PI;
    }

    public static double circleArea(final double y) {
        return Math.pow(y, 2) * Math.PI;
    }



}
