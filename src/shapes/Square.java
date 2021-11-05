package shapes;

public class Square extends Quadrilateral {
//    private double side;

    public Square( int side) {
        super(side, side);
    }

//    public Square() {
//
//    }


    public void setLength() {

    }


    void setWidth() {

    }

//    public Square(int length) {
//        super();
//    }


    public double getPerimeter() {
        return 4 * length;
    }


    public double getArea() {
        return length * length;
    }


//    Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }

    //override the getArea and getPerimeter methods with the following definitions for a square
    //
    //
    //perimeter = 4 x side
    //area = side ^ 2

//    public double getArea() {
//        System.out.println("get area from Square: ");
//        return this.side * this.side;
//    }
//
//    public double getPerimeter() {
//        System.out.println("get perimeter from Square: ");
//        return this.side * 4;
//    }
}
