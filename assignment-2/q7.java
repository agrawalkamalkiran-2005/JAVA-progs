import java.util.Scanner;
class q7
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number :");
		int n=sc.nextInt();
		int m=n;
		int r=0;
		while(m!=0)
		{
			int a=m%10;
			r=(r*10)+a;
			m=m/10;
		}
		System.out.println("reversed number ="+r);
		if(n==r)
			System.out.println("palindrome number");
		else
			System.out.println("not a palindrome number");
	}
}