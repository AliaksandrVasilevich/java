package by.topic.one.entity;

//import by.topic.one.mathematics.MathCircle;

/**
 * Created by Aliaksandr_Vasilevich on 2/12/2017.
 */
public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("The radius can not be less than zero <= 0 ");
            return;
        }
        this.radius = radius;
    }

//    public double getLength () {
//        return MathCircle.circleLength(radius);
//    }
//
//    public double getArea () {
//        return MathCircle.circleArea(radius);
//    }

}