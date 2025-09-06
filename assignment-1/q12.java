//12.write a program to test whether a number is positive,negative or zero
import java.util.Scanner;
class q12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n>0)
        System.out.println("number is positive");
        else if(n<0)
        System.out.println("number is negative");
        else
        System.out.println("number is zero");
    }
}