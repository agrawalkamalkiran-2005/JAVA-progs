/*1.Create a abstract class Bank that has abstract method getROI(). Create two classes SBI, PNB, BOI inherited from Bank.
Create a driver class that prints the rate of interest of each bank using super class memory reference.*/
abstract class Bank
{
    abstract double getROI();
}
class SBI extends Bank
{
    double getROI()
    {
        return 6.5;
    }
}
class PNB extends Bank
{
    double getROI()
    {
        return 7.0;
    }
}
class BOI extends Bank
{
    double getROI()
    {
        return 6.8;
    }
}
public class BankTest 
{
    public static void main(String[] args)
    {
        Bank b;
        b = new SBI();
        System.out.println("SBI ROI: " + b.getROI() + "%");
        b = new PNB();
        System.out.println("PNB ROI: " + b.getROI() + "%");
        b = new BOI();
        System.out.println("BOI ROI: " + b.getROI() + "%");
    }
}