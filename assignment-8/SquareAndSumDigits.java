import java.util.Scanner;
public class SquareAndSumDigits {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();
        Thread t1 = new Thread(() -> {
            int sq = num * num;
            System.out.println("Square of " + num + " = " + sq);
        }, "SquareThread");
        Thread t2 = new Thread(() -> {
            int n = Math.abs(num);
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("Sum of digits of " + num + " = " + sum);
        }, "SumDigitsThread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Both threads finished.");
    }
}
