package basic_java_programmes;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

      // Accepting double input
      System.out.println("Enter a double value: ");
      double doubleValue = sc.nextDouble();

      // Explicit casting from double to int (narrowing)
      int intValue = (int) doubleValue;

      // Displaying both values
      System.out.println("Original double value : " + doubleValue);
      System.out.println("Converted int value   : " + intValue);

      sc.close();
    }

}
