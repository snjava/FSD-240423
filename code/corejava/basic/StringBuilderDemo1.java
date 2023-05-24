public class StringBuilderDemo1 {
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb); // Hello
		sb.append(" Java");
		System.out.println(sb); // Hello Java
		sb.insert(6 ,"String in ");
		System.out.println(sb); // Hello String in Java
		sb.reverse();
		System.out.println(sb);

	}
}
// javac StringBuilderDemo1.java
// java StringBuilderDemo1 value1 value2