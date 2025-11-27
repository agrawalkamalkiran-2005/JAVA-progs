import java.util.*;
class ArmstrongCheck implements Runnable {
    int num;
    ArmstrongCheck(int n) { num = n; }

    public void run() {
        int n = num, sum = 0, temp = n;
        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        if (sum == temp)
            System.out.println(temp + " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Thread t = new Thread(new ArmstrongCheck(n));
        t.start();
    }
}
