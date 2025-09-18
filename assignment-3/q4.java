//4.Write a program that performs the addition of two numbers using command-line arguments.
public class q4 {
     public static void main(String[] args) {
         if(args.length<2){
            System.out.println("provide two numbers as command line arguments :");
            return;
         }
         int n1=Integer.parseInt(args[0]);
         int n2=Integer.parseInt(args[1]);
         int sum=n1+n2;
         System.out.println("sum is :"+sum);
     }
}
