
public class StaticKeywordDemo {
	public static void main(String[] args) {
		System.out.println(StaticDemo.b); 
		StaticDemo.print();
	}
}

class StaticDemo {
	int a = 10;			// Instance variable
	static int b = 20;	// Static/class variable
	
	public static void print() {
		int x = 20;
		System.out.println("Hello This is static method");
		System.out.println("b : " + b);
	}
}
