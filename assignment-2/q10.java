import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int largest=(a>b)?a:b;
        System.out.println("largest number is :"+largest);
    }
}
