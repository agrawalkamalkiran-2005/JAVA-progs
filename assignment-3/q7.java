//7.Write a program to accept the SIC, name, branch and marks of six subjects using command line argument. 
//Calculate the average marks.
class Student {
    String sic;
    String name;
    String branch;
    int[] marks = new int[6];
    Student(String sic, String name, String branch, int[] marks) {
        this.sic = sic;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }
    double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }
     void display() {
        System.out.println("SIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println("Average Marks: " + calculateAverage());
    }
}
public class q7 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Error: Please provide arguments as <SIC> <Name> <Branch> <6 subject marks>");
            return;
        }
        String sic = args[0];
        String name = args[1];
        String branch = args[2];
        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            marks[i] = Integer.parseInt(args[i + 3]);
        }
        Student s = new Student(sic, name, branch, marks);
        s.display();
    }
}

