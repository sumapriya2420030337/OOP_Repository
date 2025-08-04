package basic_java_programmes;
import java.util.Scanner;

public class Task1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Accept three numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculate average using a single expression
        double average = (num1 + num2 + num3) / 3;

        // Display result
        System.out.println("Average: " + average);

        sc.close();
	}

}
