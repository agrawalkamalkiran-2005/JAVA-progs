/*7. Create a class Person that has data member name. 
Use constructor to initialize name and display() to display name. 
Create a derived class Employee from Person class having private members empid. 
Using constructor initialize empid and have method display() to display empid. 
Create another derived class HourlyEmployee from Employee with private members hourlyRate and hoursWorked. 
Use constructor to initialize input and methods getGrossPay() that computes and returns the gross pay of the employee 
and display() to display the hourlyRate, hoursWorked and gross pay. 
Create a driver class to test the functionalities of the above classes and display output.*/
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name : " + name);
    }
}
class Employee extends Person {
    private int empid;
    Employee(String name, int empid) {
        super(name);
        this.empid = empid;
    }
    @Override
    void display() {
        super.display();
        System.out.println("EmpID : " + empid);
    }
}
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    HourlyEmployee(String name, int empid, double hourlyRate, int hoursWorked) {
        super(name, empid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double getGrossPay() {
        return hourlyRate * hoursWorked;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours worked : " + hoursWorked);
        System.out.println("Gross pay : " + getGrossPay());
    }
}
public class Driver7 {
    public static void main(String[] args) {
        HourlyEmployee h = new HourlyEmployee("Kamal Agrawal",7500,2000,1000);
        h.display();
    }
}
