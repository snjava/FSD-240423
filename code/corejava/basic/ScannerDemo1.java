import java.util.Scanner;
public class ScannerDemo1 {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.next();
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Number : ");
		double num2 = scan.nextDouble();
		scan.close();
		System.out.println(name);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);


	}
}