package basic_java_programmes;
import java.util.*;  // ✅ Fixed import

class Student {
    private String name;
    private int rollNo;
    private int[] marks;

    // Setter method
    void setDetails(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getter method (display info)
    void displayDetails() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks of the Student:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name of Student: ");
        String name = sc.next();

        System.out.print("Enter Roll Number of Student: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];       

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student st = new Student();
        st.setDetails(name, rollNo, marks);
        st.displayDetails();

        sc.close();
    }
}
