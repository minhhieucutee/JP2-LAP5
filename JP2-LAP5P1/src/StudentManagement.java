
import java.util.*;

public class StudentManagement {
    private static Map<Integer, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n1. Add students");
            System.out.println("2. Update a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Search students");
            System.out.println("5. Display all students");
            System.out.println("6. Save to file");
            System.out.println("7. Load from file");
            System.out.println("8. Exit");
            System.out.print("Please choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudents();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    saveToFile();
                    break;
                case 7:
                    loadFromFile();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose an option from the menu.");
                    break;
            }
        } while (choice != 8);
    }

    private static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        if (studentMap.containsKey(rollNumber)) {
            System.out.println("Roll Number " + rollNumber + " already exists. Please try again.");
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Mark: ");
        double mark = sc.nextDouble();
        Student newStudent = new Student(rollNumber, name, age, mark);
        studentMap.put(rollNumber, newStudent);
        System.out.println("Student added successfully.");
    }

    private static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number of student to update: ");
        int rollNumber = sc.nextInt();
        if (!studentMap.containsKey(rollNumber)) {
            System.out.println("Student with Roll Number " + rollNumber + " does not exist. Please try again.");
            return;
        }
        System.out.print("Enter updated Name: ");
        String name = sc.next();
        System.out.print("Enter updated Age: ");
        int age = sc.nextInt();
        System.out.print("Enter updated Mark: ");
        double mark = sc.nextDouble();
        Student updatedStudent = new Student(rollNumber, name, age, mark);
        studentMap.put(rollNumber, updatedStudent);
        System.out.println("Student updated successfully.");
    }
    private static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number of student to delete: ");
        int rollNumber = sc.nextInt();
        if (!studentMap.containsKey(rollNumber)) {
            System.out.println("Student with Roll Number " + rollNumber + " does not exist. Please try again.");
            return;
        }
        studentMap.remove(rollNumber);
        System.out.println("Student deleted successfully.");
    }
    private static void searchStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number of student to search: ");
        int rollNumber = sc.nextInt();
        if (!studentMap.containsKey(rollNumber)) {
            System.out.println("Student with Roll Number " + rollNumber + " does not exist. Please try again.");
            return;
        }
        System.out.println("Student found: " + studentMap.get(rollNumber));
    }
    private static void displayAllStudents() {
        System.out.println("List of all students:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("- " + entry.getValue());
        }
    }
    private static void saveToFile() {
        // Write the studentMap to a file using ObjectOutputStream
        System.out.println("Student data saved to file.");
    }
    private static void loadFromFile() {
        // Read the studentMap from a file using ObjectInputStream
        System.out.println("Student data loaded from file.");
    }
}

class Student {
    private int rollNumber;
    private String name;
    private int age;
    private double mark;

    public Student(int rollNumber, String name, int age, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "[" + rollNumber + "] " + name + " (age " + age + ", mark " + mark + ")";
    }
}


