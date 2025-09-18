/*3.Declare a class Complex with member real and imaginary part. Define a method initialise() to input the two
 complex numbers, show() to display the complex number and add() to add the two complex numbers.
 Declare another class to illustrate the operations of the Complex class.*/
class Complex {
    int real, imag;
    void initialise() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter real and imaginary part: ");
        real = sc.nextInt();
        imag = sc.nextInt();
    }
    void show() {
        System.out.println(real + " + " + imag + "i");
    }
    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(), c2 = new Complex();
        c1.initialise();
        c2.initialise();
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.show();
    }
}
