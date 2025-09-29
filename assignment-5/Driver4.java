/*4. Define an abstract class named “Figure”, having data members dim1 and dim2. 
Extend this class to create two concrete classes named Rectangle and Triangle. 
Override the getArea() method in the sub classes. 
Invoke the getArea() method in the main method of another Driver class through the abstract class reference variable. */
abstract class Figure {
    double dim1, dim2;
    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }
    abstract double getArea();
}
class Rectangle1 extends Figure {
    Rectangle1(double d1, double d2) {
        super(d1, d2);
    }
    @Override
    double getArea() {
        return dim1 * dim2;
    }
}
class Triangle1 extends Figure {
    Triangle1(double d1, double d2) {
        super(d1, d2);
    }
    @Override
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}
public class Driver4 {
    public static void main(String[] args) {
        Figure f;
        f = new Rectangle1(10, 5);
        System.out.println("Area of Rectangle: " + f.getArea());
        f = new Triangle1(10, 5);
        System.out.println("Area of Triangle: " + f.getArea());
    }
}
