public class ThisKeywordDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(321, "Xyz", 343434.34, 7.8);
		emp.printEmpData();
	}
}
class Employee {
	int id;
	String name;
	double salary;
	double experience;
	public Employee(int id, String name) {
		this.id = id; // accessing the instance variable of same class
		this.name = name;
	}
	public Employee(int id, String name, double salary, double experience) {
		this(id, name); // access the constructor of same class
		this.salary = salary;
		this.experience = experience;
	}
	public Employee(int id, String name, double experience) {
		this(id, name);
		this.experience = experience;
	}
	public void test() {
	}
	public void printEmpData() {
		this.test(); // access the method of same class
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Experience : " + experience);
	}
}
