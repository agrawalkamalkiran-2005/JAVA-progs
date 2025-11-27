/*4.Write a program to implement multiple inheritance using interface*/
interface Vehicle
{
    void getServiceTime();
}
class Car implements Vehicle
{
    public void getServiceTime()
    {
        System.out.println("Car service time: 10 hours");
    }
}
class Bike implements Vehicle
{
    public void getServiceTime()
    {
        System.out.println("Bike service time: 5 hours");
    }
}
public class ServiceMain1
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.getServiceTime();
        v2.getServiceTime();
    }
}
