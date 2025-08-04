package basic_java_programmes;
import java.util.ArrayList;

class Student {
     String name;
     ArrayList<String> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    public void enroll(String course) {
        courses.add(course);
    }
    public void displayCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (String course : courses) {
            System.out.println(" " + course);
        }
        System.out.println();
    }
}


public class Task_2 {
	    public static void main(String[] args) {
	        // Create students
	        Student s1 = new Student("Alice");
	        Student s2 = new Student("Bob");

	        s1.enroll("Math");
	        s1.enroll("Science");

	       s2.enroll("English");
	       s2.enroll("")
	    }
}
