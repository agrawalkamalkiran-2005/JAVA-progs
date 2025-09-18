//1.Write a program to search an element present in the array
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [10];
        System.out.println("enter elements of array :");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search : ");
        int n=sc.nextInt();
        int flag=0;
        for (int i = 0; i < 10; i++) {
            if(arr[i]==n)
            flag++;
        }
        if(flag!=0)
        System.out.println("searched element is present in the array");
        else
        System.out.println("searched element is not present");
        sc.close();
    }
}
