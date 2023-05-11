public class OperatorDemo3 {
	public static void main(String args[]) {
		int x = 10;
		x++; // Post Increment //x = x + 1; OR x += 1;
		++x; // Pre Increment //x = x + 1; OR x += 1;
		System.out.println(x);

		int y = 5;

//First increment and update the value then assign the value 
		int a = ++y;

		System.out.println(y); // 6
		System.out.println(a); // 6


		int z = 8;
		int b = --z; // z = z - 1
		System.out.println(z); // 7
		System.out.println(b); // 7			
	}
}




