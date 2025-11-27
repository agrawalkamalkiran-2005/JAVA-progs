import java.util.*;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index to access (0 to 4): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter index between 0 and 4.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer index.");
        }
        sc.close();
    }
}

