import java.util.Arrays;
import java.util.Scanner;
public class ArrayProductMultiThread {
    static int[] a, b, result;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        result = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        sc.close();
        Thread oddIndexThread = new Thread(() -> {
            for (int i = 1; i < n; i += 2) {
                result[i] = a[i] * b[i];
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
            System.out.println("Odd-index positions processed by " + Thread.currentThread().getName());
        }, "OddIndexThread");
        Thread evenIndexThread = new Thread(() -> {
            for (int i = 0; i < n; i += 2) {
                result[i] = a[i] * b[i];
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
            System.out.println("Even-index positions processed by " + Thread.currentThread().getName());
        }, "EvenIndexThread");
        oddIndexThread.start();
        evenIndexThread.start();
        oddIndexThread.join();
        evenIndexThread.join();
        System.out.println("Resultant product array: " + Arrays.toString(result));
    }
}
