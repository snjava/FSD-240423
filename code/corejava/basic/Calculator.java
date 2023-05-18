public class Calculator {
	int a = 20;
	int b = 30;
	public static void main(String args[]) {
		System.out.println("Main Started");
		Calculator cal;
		cal = new Calculator();
		Calculator cal1 = new Calculator();
		cal1.a = 45;
		cal.add();
		cal.sub(30,6);
		int ans = cal.mul();
		System.out.println("Div : " + cal.div(20,5));
   	System.out.println("Main Ends");
	}

	// create add method which perform the addition of 2 number and print the result
	public void add() {
		int ans = a + b;
		System.out.println("Add : " + ans);
	}

	// Create method sub, which accept 2 int values and print their sub.
	public void sub(int a, int b) {
		int ans = a - b;
		System.out.println("Sub : " + ans);
	}

	// Create method mul, which perform the mul of 2 number and return the result
	public int mul() {
		int x = 10;
		int y = 5;
		int ans = x * y;
		System.out.println("Mul : " + ans);
		return ans;
	}

	// create method div, which accept 2 int number and return the result of div
	public int div(int a, int b) {
		int ans = a / b;
		return ans;
	}
}









