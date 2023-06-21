
public class Intro {
	public static void main(String[] args) {
		System.out.println("Start");
		X x = new X();
		x.m();
		System.out.println("Ends");
	}
}

class X {
	public void m() {
		System.out.println("Sample Method");
	}
}