import java.util.Scanner;
public class MinSearchWithThreads {
    private static int globalMin = Integer.MAX_VALUE;
    private static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        sc.close();
        if (m <= 0) m = 1;
        if (m > n) m = n;
        Thread[] threads = new Thread[m];
        int base = n / m;
        int rem = n % m;
        int start = 0;
        for (int i = 0; i < m; i++) {
            int length = base + (i < rem ? 1 : 0);
            int s = start;
            int e = s + length - 1;
            start = e + 1;
            threads[i] = new Thread(new MinFinder(arr, s, e), "MinFinder-" + i);
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println("Global minimum: " + globalMin);
    }
    static class MinFinder implements Runnable {
        private final int[] arr;
        private final int s, e;
        MinFinder(int[] arr, int s, int e) { this.arr = arr; this.s = s; this.e = e; }
        @Override
        public void run() {
            if (s > e) return;
            int localMin = arr[s];
            for (int i = s + 1; i <= e; i++) {
                if (arr[i] < localMin) localMin = arr[i];
            }
            synchronized (lock) {
                if (localMin < globalMin) {
                    System.out.println(Thread.currentThread().getName() + " updates globalMin from " + globalMin + " to " + localMin);
                    globalMin = localMin;
                } else {
                    System.out.println(Thread.currentThread().getName() + " found localMin " + localMin + " (no update)");
                }
            }
        }
    }
}

