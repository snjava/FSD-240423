import java.util.InputMismatchException;
import java.util.Scanner;
/*
1. Identification of Exception Scenario
2. Identify the Exception class.
3. Create Object of Exception class.
4. Throw the object of exception from the statement.
*/
public class ThrowDemo {
	public static void main(String[] args) {
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.getAge();
		} catch(InvalidAgeException ex) {
			System.out.println(ex.m);
		}
	}
	
	public void getAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		
		if(!(age>=1 && age<=120)) {
			throw new InvalidAgeException("Invalid Age..");
		}
		
		System.out.println("Age Is : " + age);
	}
}
