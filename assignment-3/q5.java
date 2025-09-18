//5.Write a program that will take two integer numbers from the command prompt and find their GCD. 
//If the user does not provide exactly two numbers of arguments then the program should display error message. 
public class q5 {
  public static void main(String[] args) {
      if(args.length<2){
        System.out.println("error:provide exactly two numbers of arguments");
        return;
      }
      int n1=Integer.parseInt(args[0]);
      int n2=Integer.parseInt(args[1]);
      int gcd=findGCD(n1,n2);
      System.out.println("gcd of two numbers ="+gcd);
    }
      public static int findGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
      }
}
