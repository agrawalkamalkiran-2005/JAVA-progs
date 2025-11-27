import java.util.*;
class PalindromeThread extends Thread {
    int num;
    PalindromeThread(int n) { num = n; }

    public void run() {
        int n = num, rev = 0, temp = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        if (rev == temp)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is not Palindrome");
    }
}
class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        PalindromeThread p = new PalindromeThread(n);
        p.start();

        boolean prime = true;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) { prime = false; break; }

        if (prime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Composite");
    }
}

