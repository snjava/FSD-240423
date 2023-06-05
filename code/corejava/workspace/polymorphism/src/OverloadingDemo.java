public class OverloadingDemo {
	public static void main(String[] args) {
		//Calculation cal = new Calculation();
		Calculation.add(3.4, 5.1);
		//cal.add("Abc", "Xyz");
	}
}

class Calculation {
	public static void add(int a, int b) {
		int ans = a + b;
		System.out.println("2 int add : " + ans);
	}
	
	protected static int add(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println("3 int add : " + ans);
		return ans;
	}
	
	static void add(double a, double b) {
		double ans = a + b;
		System.out.println("2 double add : " + ans);
	}
	
	public static void add(String a, String b) {
		String ans = a + " " + b;
		System.out.println("2 String add : " + ans);
	}
	
	public static void add(String a, int b) {
		String ans = a + b;
		System.out.println("add : " + ans);
	}
	
	public static void add(int a, String b) {
		String ans = a + b;
		System.out.println("add : " + ans);
	}
	
	
	
	
	
	
	
	
}