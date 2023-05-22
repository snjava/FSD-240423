public class StringDemo2 {
	public static void main(String args[])
	{
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = "HELLO";

		System.out.println(s1 == s2);		//false
		System.out.println(s1.equals(s2));	//true
		System.out.println(s3.equalsIgnoreCase(s2));	//true

	}
}