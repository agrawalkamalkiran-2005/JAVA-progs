//6.Write a program that will take employee id, employee name, department number, salary from the command prompt. 
//If the user does not provide exactly two numbers of arguments then the program should display error message.
//Use methods display() to display the record of employee. 
class Employee {
    int empId;
    String empName;
    int deptNo;
    double salary;
    Employee(int empId, String empName, int deptNo, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptNo = deptNo;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department Number: " + deptNo);
        System.out.println("Salary: " + salary);
    }
}
public class q6 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Please provide exactly 4 arguments - <empId> <empName> <deptNo> <salary>");
            return;
        }
        int empId = Integer.parseInt(args[0]);
        String empName = args[1];
        int deptNo = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);
        Employee e = new Employee(empId, empName, deptNo, salary);
        e.display();
    }
}
