package basic_java_programmes;

public class Task_3 {
	public static void main(String[] args) {
	        // Interning
	        String str1 = "Hello";
	        String str2 = "Hello";
	        String str3 = new String("Hello");

	        System.out.println("Interning:");
	        System.out.println("str1 == str2: " + (str1 == str2)); // true, same memory (interned)
	        System.out.println("str1 == str3: " + (str1 == str3)); // false, different memory
	        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, same content
	        System.out.println();

	        // Immutability
	        String original = "Java";
	        String modified = original.concat(" Programming");

	        System.out.println("Immutability:");
	        System.out.println("original: " + original); // "Java"
	        System.out.println("modified: " + modified); // "Java Programming"
	        System.out.println();

	        // equals vs ==
	        String a = "Test";
	        String b = new String("Test");

	        System.out.println("equals vs ==:");
	        System.out.println("a == b: " + (a == b)); // false
	        System.out.println("a.equals(b): " + a.equals(b)); // true
	        System.out.println();

	        // Array of strings manipulation
	        String[] fruits = {"apple", "banana", "cherry"};
	        System.out.println("Original array:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // Modify array
	        fruits[1] = "blueberry";
	        System.out.println("\nModified array:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    
	}
	

}
