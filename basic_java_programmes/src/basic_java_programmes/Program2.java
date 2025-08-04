package basic_java_programmes;
import java.util.Scanner;


public class Program2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        sc.close();
	        if(x>0) {
	        	System.out.println("Positive");
	        }
	        else if(x<0) {
	        	System.out.println("Negative");
	        }else {
	        	System.out.println("Zero");
	        }
	 }
}
