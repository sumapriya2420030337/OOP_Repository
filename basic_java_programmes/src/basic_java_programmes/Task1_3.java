package basic_java_programmes;

public class Task1_3 {
	public static void main(String[] args) {
        int intValue = 50000;
        long longValue = intValue;      // int to long (widening)
        float floatValue = longValue;   // long to float (widening)

        // Displaying all values
        System.out.println("Original int value   : " + intValue);
        System.out.println("Converted to long    : " + longValue);
        System.out.println("Converted to float   : " + floatValue);

        // Verifying no data loss
        if (intValue == (int) floatValue) {
            System.out.println("No data is lost during widening conversion.");
        	}
	}
}
