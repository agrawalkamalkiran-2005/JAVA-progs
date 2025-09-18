/*Design a class ‘Point’ with data members as xCo and yCo. The class should have a
parameterized constructor to initialize its data members. Define a method distanceBetPoints()
which returns the distance between two points.*/
class Point {
    int xCo, yCo;
    Point(int x, int y) {
        this.xCo = x;
        this.yCo = y;
    }
    double distanceBetPoints(Point p) {
        return Math.sqrt(Math.pow(this.xCo - p.xCo, 2) + Math.pow(this.yCo - p.yCo, 2));
    }
}
public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 1);
        System.out.println("Distance: " + p1.distanceBetPoints(p2));
    }
}
