import java.util.Scanner;
public class q8 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any decimal number :");
        int n=sc.nextInt();
        String binary=Integer.toBinaryString(n);
        System.err.println("Binary value ="+binary);
    }
}

    

