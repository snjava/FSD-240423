public class InterfaceDemo3 {
	public static void main(String[] args) {
		
	}
}

@FunctionalInterface
interface DemoInter {
	public void m1();
	
	default public void m2() {
		System.out.println("Default method m2()");
	}
	
	public static void m3() {
		System.out.println("Static method m2()");
	}
}
