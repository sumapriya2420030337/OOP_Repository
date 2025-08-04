package basic_java_programmes;
import java.util.Scanner;
public class Task1_5 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

    // Accept a character
    System.out.print("Enter a character: ");
    char ch = sc.next().charAt(0);

    // Get ASCII value (implicit conversion to int)
    int asciiValue = (int) ch;

    // Display results
    System.out.println("Character entered: " + ch);
    System.out.println("ASCII value       : " + asciiValue);
    System.out.println("Integer value     : " + asciiValue);

    sc.close();
    }

}
