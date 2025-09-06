//10.Write a program to find out the sum of the individual digits of a number
import java.util.Scanner;
class q10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("sum of digits of number is ="+s);
    }
}