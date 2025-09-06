import java.util.Scanner;
class q2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of 4 subjects :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int avg=(a+b+c+d)/4;
		System.out.println("average marks is ="+avg);
		if(avg>=90)
			System.out.println("grade is O");
		else if(avg>=80 && avg<90)
			System.out.println("grade is E");
		else if(avg>=70 && avg<80)
			System.out.println("grade is A");
		else if(avg>=60 && avg<70)
			System.out.println("grade is B");
		else if(avg>=50 && avg<60)
			System.out.println("grade is C");
		else
			System.out.println("grade is F");
		sc.close();
	}
}
