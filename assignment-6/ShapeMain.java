/*3.create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea'
and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea'
is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods
'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. 
Create an object of class 'Area' and call all the three methods.*/
abstract class Shape
{
    abstract void RectangleArea(int l, int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}
class Area extends Shape
{
    void RectangleArea(int l, int b)
    {
        System.out.println("Rectangle Area: " + (l * b));
    }
    void SquareArea(int s) 
    {
        System.out.println("Square Area: " + (s * s));
    }
    void CircleArea(int r)
    {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}
public class ShapeMain
{
    public static void main(String[] args)
    {
        Area a = new Area();
        a.RectangleArea(10, 5);
        a.SquareArea(4);
        a.CircleArea(3);
    }
}
