/*Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img.
The class should have a parameterized constructor to initialize its data members.
It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for example),
addCompNumber() to add two Complex numbers. 
Test these methods by creating main method in another class.*/
class ComplexNum {
    int real, img;
    ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }
    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }
    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real, this.img + c.img);
    }
}
public class ComplexNumDemo {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(6,3);
        ComplexNum c2 = new ComplexNum(2, 4);
        ComplexNum sum = c1.addCompNumber(c2);
        sum.displayCompNumber();
    }
}
