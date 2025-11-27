import java.util.*;
public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            int[] arr = {1, 2, 3};
            System.out.print("Enter array index to access: ");
            int index = sc.nextInt();
            System.out.println("Value = " + arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            System.out.println("Execution completed.");
        }
        sc.close();
    }
}
