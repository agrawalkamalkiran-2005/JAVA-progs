//4.write a program to swap 2 numbers without using third variable
import java.util.Scanner;
class q4
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }    
}