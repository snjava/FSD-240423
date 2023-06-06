public class OverridingDemo {
	public static void main(String[] args) {
		// Polymorphic Object (Parent class Reference and child class Object)
		Parent obj = new Child1();
		obj.m();
	}
}
class Parent {
	int m() {
		System.out.println("m() method from Parent class");
		return 0;
	}	
}
class Child extends Parent {
	public int m() {
		System.out.println("m() method from Child Class");
		return 0;
	}
}
class Child1 extends Parent {
	public int m() {
		System.out.println("Override method inside child1");
		return 10;
	}
}
