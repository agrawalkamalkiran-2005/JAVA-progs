import java.math.BigInteger;
import java.util.Scanner;
public class TableAndFactorial {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        Thread tableThread = new Thread(() -> {
            System.out.println("Multiplication table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
                try { Thread.sleep(50); } catch (InterruptedException e) { /* ignore */ }
            }
        }, "TableThread");
        Thread factorialThread = new Thread(() -> {
            BigInteger fact = BigInteger.ONE;
            for (int i = 2; i <= n; i++) fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println("Factorial of " + n + " = " + fact);
        }, "FactorialThread");
        tableThread.start();
        factorialThread.start();
        tableThread.join();
        factorialThread.join();
        System.out.println("Main: both worker threads finished.");
    }
}
