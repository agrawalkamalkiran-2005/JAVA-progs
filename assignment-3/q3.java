//3.Write a program input two matrices and perform the addition of two matrices
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns of first array :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][] arr1=new int[r1][c1];
        System.out.println("enter elements of first array :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the rows and columns of second array :");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][] arr2=new int[r2][c2];
        System.out.println("enter elements of first array :");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(r1!=r2 || c1!=c2)
        System.out.println("addition of matrices is not possible");
        else{
            int [][] sum=new int[c1][r1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
        System.out.println("sum of two matrices is :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.println(sum[i][j]);
            }
        }
        }
    }
}
