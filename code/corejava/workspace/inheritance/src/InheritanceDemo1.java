
public class InheritanceDemo1 {
	public static void main(String[] args) {
		SoftwareDev dev = new SoftwareDev();
		dev.salary = 234232.32;
		dev.city = "Pune";
		dev.id = 121;
		dev.name = "Abc";
		dev.skills = "Java";
		dev.printDevInfo();
	}
}
class Person {
	String name;
	String city;
	private int a; // will not inherit in any of the sub-class
	public void printPersonInfo() {
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
	}
}
// Employee IS-A Person
class Employee extends Person {
	int id = 120;
	double salary;
	public void printEmployeeInfo() {
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
		printPersonInfo();
	}
}
class SoftwareDev extends Employee {
	String skills;
	public void printDevInfo() {
		System.out.println("Skills : " + skills);
		printEmployeeInfo();
	}
}
class Doctor extends Person {
	String regNo;
	String speciality;
	public void printDoctorInfo() {
		System.out.println("Register Number : " + regNo);
		System.out.println("Speciality : " + speciality);
		printPersonInfo();
	}
}






