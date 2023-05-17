public class CalculateAge
{
	public static void main(String[] args) {
		CalculateAge obj = new CalculateAge();
		int result = obj.getAge(2010);
		System.out.println(result);
	}

	public int getAge(int birthYear)
	{
		int currentYear = 2023;
		int age = currentYear - birthYear;
		return age;
	}

}