/*3. Write a program to create a class named Shape. 
It should contain two methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively. 
For this class, create three sub classes, Circle, Triangle and Square 
and each class should override the parent class functions - draw () and erase ().  
The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively.  
The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively.  
Create objects of Circle, Triangle and Square, assign each to Shape variable(reference) and 
call draw() and erase() method using each object.*/
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
    void erase() {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}
public class Driver3 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s.erase();
        s = new Triangle();
        s.draw();
        s.erase();
        s = new Square();
        s.draw();
        s.erase();
    }
}
