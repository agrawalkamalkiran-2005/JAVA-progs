//8.Write a program to reverse a number.
import java.util.Scanner;
class q8
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter a number:");
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.err.println("reversed number is ="+rev);
    }
}
