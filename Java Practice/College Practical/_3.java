


public class _3 {
    static class Person {
        // Instance variables
        String name;
        int age;
    
        // Constructor to initialize the object
        public Person(String n, int a) {
            name = n;
            age = a;
        }
    }
    
        
        // Method that accepts a Person object
        public static void displayDetails(Person p) {
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
        }
    
    
    public static void main(String[] args) {
         // Create a Person object
         Person person1 = new Person("Alice", 30);

         // Pass the Person object to the displayDetails method
         displayDetails(person1);
    }
}

