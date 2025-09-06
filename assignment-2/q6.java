import java.util.Scanner;
class q6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number :");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=flag+1;
		}
		if(flag==0)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}
}