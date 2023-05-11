public class OperatorDemo4 {
	public static void main(String args[]) {
		int a = 10;
		int b = 9;
		int c = 10;
		int x = 100;
		
		a = x; 	// Assigning the value
		boolean ans = a == x; 	// comparing the value	
		System.out.println(ans); 

		boolean result = a >= c;
		System.out.println(result);

		System.out.println(a < b); 	// false
		System.out.println(a <= c);	// true

		System.out.println(a == c);	// true
		System.out.println(a != c);	// false
	}
}