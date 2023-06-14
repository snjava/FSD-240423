import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		int arr[] = {23,25,5,98,0,43,30,76,9};
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter 1st Index : ");
			int idx1 = scan.nextInt();
			System.out.println("Enter 2nd Index : ");
			int idx2 = scan.nextInt();
			
			int num1 = arr[idx1];
			int num2 = arr[idx2];
			
			System.out.println("Add : " + (num1 + num2));
			System.out.println("Div : " + (num1 / num2));
			System.out.println("Sub : " + (num1 - num2));
			System.out.println("Mul : " + (num1 * num2));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index...");
		} catch(ArithmeticException e) {
			System.out.println("Cannot / by zero");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			scan.close();
		}
		System.out.println("End of the program");
	}
}
