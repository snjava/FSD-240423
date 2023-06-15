import java.util.InputMismatchException;
import java.util.Scanner;

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
