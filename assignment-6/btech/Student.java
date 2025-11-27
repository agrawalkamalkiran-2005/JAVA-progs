/*6.Create a Package btech which has one class Student. Accept student detail through parameterized constructor of
Student class. Write a method display()to display the student details. Create another class Test containing the main 
method which will use the package btech and calculate total marks and percentage of marks. One sample output is shown below.*/
package btech;
public class Student
{
    int roll;
    String name;
    int[] marks = new int[3];
    public Student(int roll, String name, int m1, int m2, int m3)
    {
        this.roll = roll;
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }
    public void display()
    {
        int total = marks[0] + marks[1] + marks[2];
        float percent = total / 3f;
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks:");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percent + "%");
    }
}


