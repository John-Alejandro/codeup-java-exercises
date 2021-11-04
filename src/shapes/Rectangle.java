package shapes;

import org.w3c.dom.css.Rect;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }

//    public Rectangle(int length) {
//        super();
//    }
//
//    public Rectangle() {
//
//    }


    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }


    public double getArea() {
        return length * width;
    }


    public void setLength(double length) {

    }


    public void setWidth(double width) {

    }

//    Shapes
//
//    Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//
//    perimeter = 2 x length + 2 x width
//    area = length x width

//    protected double length;
//    protected double width;
//
//    //constructor
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (this.length + this.width);
//    }
}

//    Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
//
//IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
