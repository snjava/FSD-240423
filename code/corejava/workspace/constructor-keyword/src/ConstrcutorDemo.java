
public class ConstrcutorDemo {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student(111, "Xyz", 22);
		Student st3 = new Student(222, "Abc");
		System.out.println(st3.id);  // -1
		System.out.println(st3.name);// NA
		System.out.println(st3.age); // -1
	}
}

class Student {
	int id;
	String name;
	int age;
	
	public Student() { // no-param constructor
		id = -1;
		name = "NA";
		age = -1;
	}
	
	public Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	public Student(int i, String n) {
		id = i;
		name = n;
	}
}






