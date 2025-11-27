import java.util.Scanner;
public class SumNaturalWithThreads {
    private static long total = 0L;
    private static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (sum 1..n): ");
        long n = sc.nextLong();
        System.out.print("Enter number of threads m: ");
        int m = sc.nextInt();
        sc.close();
        if (m <= 0) m = 1;
        Thread[] threads = new Thread[m];
        long per = n / m;
        long rem = n % m;
        long start = 1;
        for (int i = 0; i < m; i++) {
            long count = per + (i < rem ? 1 : 0);
            long s = start;
            long e = (count == 0) ? (start - 1) : (start + count - 1);
            start = e + 1;
            threads[i] = new Thread(new RangeAdder(s, e), "Adder-" + i);
            threads[i].start();
        }
        for (Thread t : threads) if (t != null) t.join();
        System.out.println("Total sum 1.."+n+" = " + total);
    }
    static class RangeAdder implements Runnable {
        private final long s, e;
        RangeAdder(long s, long e) { this.s = s; this.e = e; }
        @Override
        public void run() {
            long partial = 0;
            for (long i = s; i <= e; i++) partial += i;
            synchronized (lock) {
                long before = total;
                total += partial;
                System.out.println(Thread.currentThread().getName() + " added " + partial + " (total before=" + before + ", after=" + total + ")");
            }
        }
    }
}
