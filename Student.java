public class Student {

    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student(101, "Vaishnavi", 89.5);

        // Displaying student details
        s1.display();
    }
}
