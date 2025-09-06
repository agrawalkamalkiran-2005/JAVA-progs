import java.util.Scanner;
class q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter income :");
		int n= sc.nextInt();
		if(n<150000)
			System.out.println("no tax chargable");
		else if(n>150001 && n<300000)
			System.out.println("tax payable is ="+(n*0.1));
		else if(n>300001 && n<500000)
			System.out.println("tax payable is ="+(n*0.2));
		else
			System.out.println("tax payable is ="+(n*0.3));
			sc.close();
	}
}