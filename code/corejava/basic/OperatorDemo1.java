public class OperatorDemo1 {
	public static void main(String args[]) {
		int a = 10;
		int b = 15;
		int ans = a + b;
		System.out.println(ans);		// 25
		System.out.println(a - b);	// -5
		System.out.println(a * b);	// 150
		System.out.println(a / 3);	// 3
		System.out.println(b % 3);	// 0
		
		byte c = 5;
		c = (byte) (c + 2);
		System.out.println(c);	// 7
	}
}