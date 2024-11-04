// base class : University

class University {
    String name;
    int id;

    public University(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Derived class : Faculty (inherits from University)

class Faculty extends University {
    String facultyName;

    public Faculty(String name, int id, String facultyName) {
        super(name, id);
        this.facultyName = facultyName;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Faculty Name: " + facultyName);
    }
}

class Department extends Faculty {
    String departmentName;

    public Department(String name, int id, String facultyName, String departmentName) {
        super(name, id, facultyName);
        this.departmentName = departmentName;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + departmentName);
    }

}

class Student extends Department {
    String studentName;
    double fees;

    public Student(String name, int id, String facultyName, String departmentName, String studentName) {
        super(name, id, facultyName, departmentName);
        this.studentName = studentName;
        this.fees = calculateFees();
    }

    public double calculateFees() {
        // calculate and return the fees based on the student's age
        return 1000.00;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Name: " + studentName);
        System.out.println("Fees: " + fees);
    }

    public void registerStudent() {
        // register the student in the university
        System.out.println(studentName + " has been registered successfully.");
    }
}

/**
 * UniversityManagementSystem
 */
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("Arka Jain University", 230415, "Sneha Kashyap", "BCA", "Ankit Saw");

        System.out.println("University Information ");
        student.displayInfo();

        System.out.println("\nStudent Registration");
        student.registerStudent();
    }

}