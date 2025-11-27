import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        while (true) {
            try {
                System.out.print("Enter first number (n1): ");
                n1 = sc.nextInt();
                System.out.print("Enter second number (n2): ");
                n2 = sc.nextInt();
                int result = n1 / n2;
                System.out.println("Result = " + result);
                break; // exit loop if no exception
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed. Please enter n2 again.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid integers.");
                sc.next(); // clear invalid input
            }
        }
        sc.close();
    }
}
