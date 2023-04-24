import java.util.Scanner;

public class Student {
   
     String studentNumber, name, course;
     int year;
    
    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student number: ");
       studentNumber = sc.nextLine();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter course: ");
        this.course = sc.nextLine();
        System.out.print("Enter year: ");
        this.year = sc.nextInt();
    }
    
    public void showStudentDetails() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
        System.out.println("Year: " + this.year);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); 
        
        Student[] students = new Student[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            System.out.println("Student ["+(i+1)+"]");
            students[i].getStudentDetails();
            System.out.println();
        }
        
        System.out.println();
        for (int i = 0; i < numStudents; i++) {
            students[i].showStudentDetails();
            System.out.println();
        }
    }
}
