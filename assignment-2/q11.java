import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("largest number is ="+largest);
    }
}
