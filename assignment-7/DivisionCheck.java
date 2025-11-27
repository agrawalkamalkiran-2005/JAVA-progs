import java.util.*;
public class DivisionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter value of x: ");
            int x = sc.nextInt();
            System.out.print("Enter value of y: ");
            int y = sc.nextInt();

            if (x - y == 0) {
                throw new ArithmeticException("Denominator (x - y) cannot be zero.");
            }
            int result = x / (x - y);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers.");
        }
        sc.close();
    }
}
