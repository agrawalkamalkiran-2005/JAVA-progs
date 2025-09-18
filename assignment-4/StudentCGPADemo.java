/*Define a class Student having the attribute regNo,  stdName,  branch and CGPA.
 Write 2 methods to accept and display the student details. 
 Read the details of 50 students using an array of Student class object. 
Display the student details who has secured the highest CGPA.*/
class Student {
    int regNo;
    String stdName, branch;
    double CGPA;
    void accept() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter regNo, name, branch, CGPA: ");
        regNo = sc.nextInt();
        sc.nextLine();
        stdName = sc.nextLine();
        branch = sc.nextLine();
        CGPA = sc.nextDouble();
    }
    void display() {
        System.out.println(regNo + " | " + stdName + " | " + branch + " | " + CGPA);
    }
}
public class StudentCGPADemo {
    public static void main(String[] args) {
        Student[] students = new Student[50];
        Student topStudent = null;
        double maxCGPA = -1;
        for (int i = 0; i < 2;i++) {
            students[i] = new Student();
            students[i].accept();
            if (students[i].CGPA > maxCGPA) {
                maxCGPA = students[i].CGPA;
                topStudent = students[i];
            }
        }
        System.out.println("Topper:");
        topStudent.display();
    }
}
