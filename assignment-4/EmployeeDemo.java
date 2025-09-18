/*Write a program to declare a class employee with data members empid, ename, dept, sal.
Add a method getData(), putData() to accept and display the details of n employees.
Define a driver class to create the objects of employee class and perform basic operations.*/
class Employee {
    int empid;
    String ename, dept;
    double sal;
    void getData() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter empid, name, dept, salary: ");
        empid = sc.nextInt();
        sc.nextLine();
        ename = sc.nextLine();
        dept = sc.nextLine();
        sal = sc.nextDouble();
    }
    void putData() {
        System.out.println(empid + " | " + ename + " | " + dept + " | " + sal);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] empArr = new Employee[n];
        for (int i = 0; i < n; i++) {
            empArr[i] = new Employee();
            empArr[i].getData();
        }
        System.out.println("Employee Details:");
        for (Employee e : empArr) {
            e.putData();
        }
    }
}

