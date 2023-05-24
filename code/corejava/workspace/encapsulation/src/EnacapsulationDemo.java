public class EnacapsulationDemo {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studId = 123;
		stud.name = "Abc";
		stud.age = 22.3;
		
		if(stud.age>=5 && stud.age<=50)
		{
			stud.printStudent();
		} else {
			System.out.println("Invalid Age....");
		}
	}
}

class Student {
	int studId;
	String name;
	double age;
	
	public void printStudent() {
		System.out.println("Id : " + studId);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

