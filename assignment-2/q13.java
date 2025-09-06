import java.util.Scanner;

public class q13 {
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        q13 obj=new q13();
        int result=obj.gcd(a,b);
        System.out.println("gcd of " +a+ "and" +b+ "is:"+result);
    }
}
