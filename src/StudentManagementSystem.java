import java.util.ArrayList;
import java.util.Scanner;
class student {
    private int id;
    private String name;
    private double marks;
    public student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    // Display student details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class StudentManagementSystem {

    static ArrayList<student> studentList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n Student Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // Add Student
    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scan.nextInt();
        scan.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scan.nextDouble();

        student student = new student(id, name, marks);
        studentList.add(student);

        System.out.println("Student added successfully!");
    }

    // View Students
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (student student : studentList) {
            student.display();
        }
    }

    // Update Student
    public static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = scan.nextInt();

        for (student student : studentList) {
            if (student.getId() == id) {

                scan.nextLine(); // clear buffer

                System.out.print("Enter new Name: ");
                String name = scan.nextLine();

                System.out.print("Enter new Marks: ");
                double marks = scan.nextDouble();

                student.setName(name);
                student.setMarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Delete Student
    public static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = scan.nextInt();

        for (student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}
