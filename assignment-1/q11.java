//11.Write a program to check whether an inputted number is positive or negative.
import java.util.Scanner;
class q11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        if(n>=0)
        {
            System.out.println("number is positive");
        }
        else
        {
            System.out.println("number is negative");
        }
    }
}
