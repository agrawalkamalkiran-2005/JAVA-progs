import java.util.Scanner;
import org.shapes.*;
public class TestShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                Square sq = new Square(side);
                System.out.println("Area of Square: " + sq.area());
                System.out.println("Perimeter of Square: " + sq.perimeter());
                break;
            case 2:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("Area of Circle: " + c.area());
                System.out.println("Perimeter of Circle: " + c.perimeter());
                break;
            case 3:
                System.out.print("Enter three sides of triangle: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c1 = sc.nextDouble();
                Triangle t = new Triangle(a, b, c1);
                System.out.println("Area of Triangle: " + t.area());
                System.out.println("Perimeter of Triangle: " + t.perimeter());
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
