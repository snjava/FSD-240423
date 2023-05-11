public class OperatorDemo6 {
	public static void main(String args[]) {
		int a = 10;
		int b = 5;
		System.out.println(a & b);  // 0
		System.out.println(a | b);  // 15

		System.out.println("===== & | ======");
		System.out.println(a>1 & a<30); // true
		System.out.println(a>9 | a>20); // true

		System.out.println("===== && || ======");
		System.out.println(a>10 && a<30); // false
		System.out.println(a>9 || a>20);  // true

		System.out.println(!((a+=1)>10)); // false
	}
}