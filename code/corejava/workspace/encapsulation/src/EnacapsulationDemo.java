public class EnacapsulationDemo {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setStudId(123);
		stud.setName("Abc");
		stud.setStudAge(22.3);
	}
}

// Encapsulated, DTO (Data Transfer Object)
class Student {
	private int studId;
	private String studName;
	private double studAge;
	
	public int getStudId() {
		return studId;
	}
	public String getStudName() {
		return studName;
	}
	public double getStudAge() {
		return studAge;
	}
	
	
	public void setStudId(int id) {
		studId = id;
	}
	public void setName(String nm) {
		studName = nm;
	}
	public void setStudAge(double age) {
		if(age>=5 && age<=50)
		{
			studAge = age;
		} else {
			System.out.println("Invalid Age....");
		}
	}
	
	public void printStudent() {
		System.out.println("Id : " + studId);
		System.out.println("Name : " + studName);
		System.out.println("Age : " + studAge);
	}
}

