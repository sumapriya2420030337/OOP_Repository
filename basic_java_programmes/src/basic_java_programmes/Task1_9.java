package basic_java_programmes;
import java.util.Scanner;

public class Task1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a>>b);
		System.out.println(a<<b);
		scan.close();
	}

}
