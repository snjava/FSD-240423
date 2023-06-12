import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter 1st Number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2 = scan.nextInt();
			int ans = num1/num2;
			System.out.println("Div : " + ans);
		}
		catch(ArithmeticException ex) {
			System.out.println("Invalid Division. Cannot Divide by Zero");
		}
		catch(InputMismatchException ex) {
			System.out.println("Invalid Input. Please provide numeric values only..");
		}
		System.out.println("Main Method End");
	}
}
