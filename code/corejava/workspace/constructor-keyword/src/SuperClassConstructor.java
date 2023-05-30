
public class SuperClassConstructor {
	public static void main(String[] args) {
		B b= new B(10);
	}
}

class A {
	public A() {
		super();
		System.out.println("A class Default Constructor..");
	}
	public A(int a) {
		super();
		System.out.println("A class 1 int param Constructor..");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("B class Default Constructor..");
	}
	public B(int a) {
		super(20);
		System.out.println("B class 1 int param Constructor..");
	}
}
