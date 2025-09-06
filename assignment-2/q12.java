import java.util.Scanner;

public class q12 {
    int Sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        q12 obj=new q12();
        int result=obj.Sum(n);
        System.out.println("sum of first "+n+"natural numbers is :"+result);
    }
}
