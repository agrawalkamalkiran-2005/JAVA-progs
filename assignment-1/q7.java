//7.Write a program to input the time value in seconds and then display it in the hour: minute: second format
import java.util.Scanner;
class q7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time in second :");
        int sec=sc.nextInt();        
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        int s = sec % 60;
        System.out.println(h + " Hour: " + m + " Minute: " + s + " Seconds");
    }
}
