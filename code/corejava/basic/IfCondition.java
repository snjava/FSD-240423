public class IfCondition {
	public static void main(String args[]) {
		double percent = -30.55;
		if(percent >= 40 && percent<=100) {
			System.out.println("You are Pass...");
		}
		else if(percent>=0 && percent<40) {
			System.out.println("You are Fail...");
		}
		else {
			System.out.println("Invalid Percent.!!!");
		}
	}
}