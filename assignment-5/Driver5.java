/*5. Create a class Point2D with the data member x and y coordinate. 
Use default and parameterised constructor to set the coordinate values and display() to show the coordinates. 
Create a subclass called Point3D which is derived from the superclass Point2D with data members z coordinate 
and has constructor to initialize the input and show() method to display the coordinates. 
Test the methods of both the classes by creating objects in the main method of driver class.*/
class Point2D {
    int x, y;
    Point2D() {
        x = 0;
        y = 0;
    }
    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("Point2D Coordinates: (" + x + ", " + y + ")");
    }
}
class Point3D extends Point2D {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    void show() {
        System.out.println("Point3D Coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}
public class Driver5 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(5, 10);
        p1.display();
        Point3D p2 = new Point3D(5, 10, 15);
        p2.show();
    }
}
