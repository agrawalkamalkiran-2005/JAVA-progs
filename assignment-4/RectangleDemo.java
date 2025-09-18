/*Write a program to create a class named 'Rectangle' with data members 'length' and 'breadth'
and methods to calculate area and perimeter. Use constructors to initialize values.
Create a driver class to test the functionalities.*/
class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return length * breadth;
    }
    int perimeter() {
        return 2 * (length + breadth);
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20,5);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
