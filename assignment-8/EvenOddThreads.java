import java.util.*;

class OddThread extends Thread {
    int m, n;
    OddThread(int m, int n) { this.m = m; this.n = n; }

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = m; i <= n; i++)
            if (i % 2 != 0) System.out.print(i + " ");
        System.out.println();
    }
}

class EvenOddThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m and n: ");
        int m = sc.nextInt(), n = sc.nextInt();

        OddThread t = new OddThread(m, n);
        t.start();

        System.out.println("Even Numbers:");
        for (int i = m; i <= n; i++)
            if (i % 2 == 0) System.out.print(i + " ");
        System.out.println();
    }
}

