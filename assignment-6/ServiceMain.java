/*5.Create an interface Servicing that has abstract methods getServiceTime(). Create two class Car, Bike that
implement interface. Create a driver class that creates the objects of two class and displays the service time*/
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
public class ServiceMain
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.getServiceTime();
        v2.getServiceTime();
    }
}
