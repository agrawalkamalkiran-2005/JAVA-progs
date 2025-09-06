//3.Write a program to input two floating point numbers through the keyboard and display their sum.
import java.util.Scanner;
class q3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 floating numbers : ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("sum is ="+(x+y)); 
        sc.close();
} 
}
  