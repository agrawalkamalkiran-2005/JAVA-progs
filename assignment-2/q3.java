import java.util.Scanner;
class q3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the coefficient of x*2 :");
		int a=sc.nextInt();
		System.out.println("enter the coefficient of x :");
		int b=sc.nextInt();
		System.out.println("enter the constant term :");
		int c=sc.nextInt();
		double d=(b*b)-(4*a*c);
		if(d<0)
			System.out.println("roots are imaginary");
		else
		{
			System.out.println("first root ="+((-b+Math.sqrt(d))/(2*a)));
			System.out.println("second root ="+((-b-Math.sqrt(d))/(2*a)));
		}
	}
}