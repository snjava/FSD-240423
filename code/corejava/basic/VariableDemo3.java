public class VariableDemo3
{
	public static void main(String args[])
	{
		byte b = 10;
		int x = 10;
		b = (byte) (x + 1); // Explict casting
		short y = (short) (b + 1);

		long l = y + 10; // Implicit Casting

		System.out.println(b);
		System.out.println(y);
		System.out.println(l);

		byte p = 127;
		p = (byte) (p + 5); // 132
		System.out.println(p);
	}
}






