public class OperatorDemo2 {
	public static void main(String args[]) {
		int a = 10;
		int b = 15;
		//a+=b;		// a = a + b;
		//a-=b;		// a = a - b;	
		a*=b;		// a = a * b;	
		System.out.println(a);	// 150
		System.out.println(b);	// 15

		byte c = 5;
		c+=2;		//c = (byte) (c + 2);
		System.out.println(c);
	}
}