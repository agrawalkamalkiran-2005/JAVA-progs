import btech1.arithmetic.MyMath;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath m=new MyMath();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition: " + m.add(a, b));
        System.out.println("Subtraction: " + m.subtract(a, b));
        System.out.println("Multiplication: " + m.multiply(a, b));
        System.out.println("Division: " + m.divide(a, b));
        System.out.println("Modulus: " + m.mod(a, b));
        sc.close();
    }
}
