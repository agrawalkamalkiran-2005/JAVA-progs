/*Define an interface Calculator which has the basic methods add(), sub( ), mul() and div(). Define a concrete 
class named as DemoCalculator that implements the interface. Define the driver class, which create object reference
of the interface Calculator and perform all basic operation of the calculator*/
interface Calculator
{
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}
class DemoCalculator implements Calculator 
{
    public void add(int a, int b)
    {
        System.out.println("Addition: " + (a + b));
    }
    public void sub(int a, int b)
    {
        System.out.println("Subtraction: " + (a - b));
    }
    public void mul(int a, int b)
    {
        System.out.println("Multiplication: " + (a * b));
    }
    public void div(int a, int b) 
    {
        System.out.println("Division: " + ((float)a / b));
    }
}
public class CalculatorMain
{
    public static void main(String[] args)
    {
        Calculator c = new DemoCalculator();
        c.add(10, 5);
        c.sub(10, 5);
        c.mul(10, 5);
        c.div(10, 5);
    }
}
