/*Write a program to print the average of three numbers entered by user by creating a class named 'Average'
having a method to calculate and print the average. Define another driver class to demonstrate the basic operation.
*/
import java.util.Scanner;
class Average {
    void calculateAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average: " + avg);
    }
}
public class AverageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Average avg = new Average();
        avg.calculateAverage(x, y, z);
        sc.close();
    }
}
