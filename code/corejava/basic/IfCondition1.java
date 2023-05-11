/*
	Create age variable and assign some value to it. Print the Age Group.
	1-17: Kids Age
	18-23: Teen Age
	24-60: Adulet Age
	60-120: Old Age
	other than this: Invalid Age
*/


public class IfCondition1 {
	public static void main(String args[]) {
		int age = 67;
		if(age>=1 && age<=120) {
			System.out.println("Valid Age...");
			if(age>=1 && age<=17) {
				System.out.println("Kids Age...");
			}
			else if(age>=18 && age<=23) {
				System.out.println("Teen Age...");
			}
			else if(age>=24 && age<=60) {
				System.out.println("Adult Age...");
			}
			else if(age>=60 && age<=120) {
				System.out.println("Old Age...");
			}
		} 
		else {
			System.out.println("Invalid Age...");
		}

	}
}









