package basic_java_programmes;
import java.util.Scanner;


public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int x = sc.nextInt();
		sc.close();
		if(x%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}

}
