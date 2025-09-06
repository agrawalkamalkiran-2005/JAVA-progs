//6.Write a program to input the marks of a student in three different subjects and then display the average mark.
import java.util.Scanner;
class q6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of 3 subjects :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double avg=(a+b+c)/3;
        System.out.println("average marks of 3 sujects= "+ avg );
    }
}