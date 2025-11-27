import java.util.*;
class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}
public class LengthConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter length in feet: ");
                double feet = sc.nextDouble();
                System.out.print("Enter length in inches: ");
                double inches = sc.nextDouble();
                if (feet < 0 || inches < 0)
                    throw new InvalidInputException("Negative values are not allowed.");
                double cm = (feet * 12 + inches) * 2.54;
                System.out.println("Equivalent length in centimeters: " + cm);
                break;
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage() + " Please re-enter values.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter numeric values only.");
                sc.next(); // clear invalid input
            }
        }
        sc.close();
    }
}
