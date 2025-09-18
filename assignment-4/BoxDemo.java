/*Create a class Box with constructors to initialize dimensions. Overload constructors to allow different ways of initializing
Include a method to calculate volume.*/
class Box {
    double length, breadth, height;
    Box() {
        length = breadth = height = 2;
    }
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    double volume() {
        return length * breadth * height;
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(2, 3, 4);
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
    }
}

