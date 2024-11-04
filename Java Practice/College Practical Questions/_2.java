// class Student {
//     // Instance variables
//     String name;
//     int age;

//     // Parameterized constructor
//    public  Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     // Method to display student details
//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

public class _2 {
    static class Student {
        // Instance variables
        String name;
        int age;

        // Parameterized constructor
        public Student(String n, int a) {
            name = n;
            age = a;
        }

        // Method to display student details
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Display the details of the students
        student1.display();
        student2.display();
    }
}
