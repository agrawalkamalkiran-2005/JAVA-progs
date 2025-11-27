/*6.Create a Package btech which has one class Student. Accept student detail through parameterized constructor of
Student class. Write a method display()to display the student details. Create another class Test containing the main 
method which will use the package btech and calculate total marks and percentage of marks. One sample output is shown below.*/
import btech.Student;
import java.util.Scanner;
public class StudentMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter 3 subject marks: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        Student s = new Student(r, n, m1, m2, m3);
        s.display();
        sc.close();
    }
}