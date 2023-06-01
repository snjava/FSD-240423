
public class FinalKeywordDemo {
	public static void main(String[] args) {
		FinalDemo demo = new FinalDemo();
		demo.a = 20;
	}
}

final class FinalDemo { // Final Class
	int a = 10;
	final double PI = 3.14; // Final Variable
	
	public final void executeFormaula() { // Final method
		// logic
	}
}
