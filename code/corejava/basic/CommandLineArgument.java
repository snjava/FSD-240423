public class CommandLineArgument {
	public static void main(String args[])
	{
		System.out.println("Main Started");

		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);
		System.out.println(num1 + num2);
		
		System.out.println("End Started");
	}
}