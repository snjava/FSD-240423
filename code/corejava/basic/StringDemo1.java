public class StringDemo1 {
	public static void main(String args[])
	{
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = "Hello";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1 == s2); //false
		System.out.println(s2 == s3); //false
		System.out.println(s1 == s3); //false
		System.out.println(s2 == s4); //true
		System.out.println(s3 == s4); //false
		System.out.println("Hello" == s1); //false
		System.out.println("Hello" == s4); //true

	}
}